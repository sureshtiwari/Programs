package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// ASK: Number logs to the right. Letter logs to the left.
// Letter logs must be sorted lexicographically
// Create an output array. Loop through input.
// If a log is numeric, push it to the end of the array (keep track of next element to use for number)
// Put the strings (without id) into an list and sort the list
// iterate through sorted list and for each, get the 

class Datalog {
    public String[] reorderLogFiles(String[] logs) {
        if (logs == null || logs.length < 2) return logs;
        
        // Create an output array
        String[] output = new String[logs.length];
        
        // Create an identifier for posToInsertNumericLog - equal to last index in array
        int posToInsertNumericLog = logs.length - 1;
        
        // Create a list for digit logs
        List<String> digits = new ArrayList<>();
        List<String> numbers = new ArrayList<>();
            
        // Loop through logs
        for (String log: logs) {
            // Identify if log is numeric or not
            boolean isNumericLog = isNumeric(log);
            
            // If log is numeric, add at posToInsertNumericLog and decrement it (non-null element) -- 
            if (isNumericLog) {
                numbers.add(log);
            } else {
                // If log is digits.. Add value to digit logs list
                digits.add(log);
            }
        }
        
        // Sort digit logs list using a special comparator that ignores identifier, unless it must not
        Comparator<String> strComparator = (s1, s2) -> {
            String s1Word = getWord(s1);
            String s2Word = getWord(s2);
            int wordComparisonResult = s1Word.compareTo(s2Word);
            if (wordComparisonResult == 0) {
                return s1.compareTo(s2);
            } else {
                return wordComparisonResult;
            }
        };
        
        Collections.sort(digits, strComparator);
        
        int idx = 0;
        for(String d: digits) {
            output[idx++] = d;
        }
        for(String n: numbers) {
            output[idx++] = n;
        }
        
        return output;
        
    }
    
    private String getWord(String s) {
        int firstSpace = s.indexOf(' ');
        return s.substring(firstSpace+1);
    }
    
    private boolean isNumeric(String log) {
        boolean isNumericLog = true;
        int firstSpaceIdx = log.indexOf(' ');
        char leFirstChar = log.toCharArray()[firstSpaceIdx + 1];
        if(leFirstChar >= 97 && leFirstChar <= 122) isNumericLog = false;
        return isNumericLog;
    }
}