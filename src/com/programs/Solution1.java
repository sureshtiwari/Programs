package com.programs;

import java.io.*;

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution1 {

	static int makeAnagram(String a, String b) {
		HashMap<Character, Integer> astring = new HashMap<Character, Integer>();
		HashMap<Character, Integer> bstring = new HashMap<Character, Integer>();
        for(int i=0;i<a.length();i++)
        	if(astring.containsKey(a.charAt(i)))
        		astring.put(a.charAt(i), astring.get(a.charAt(i))+1);
        	else
        		astring.put(a.charAt(i), 1);
        
        for(int i=0;i<b.length();i++)
        	if(bstring.containsKey(b.charAt(i)))
        		bstring.put(b.charAt(i), bstring.get(b.charAt(i))+1);
        	else
        		bstring.put(b.charAt(i), 1);
        
        for(int i=0;i<b.length();i++)
        {
        	char c = b.charAt(i);
        	if(astring.containsKey(c))
        	{
        		if(astring.get(c)==1)
        			astring.remove(c);
        		else
        			astring.put(c, astring.get(c)-1);
        		
        		if(bstring.get(c)==1)
        			bstring.remove(c);
        		else
        			bstring.put(c, bstring.get(c)-1);
        		
        	}
        }
        Collection<Integer> temp =astring.values();
        Iterator<Integer> iterator = temp.iterator();
        int result = 0;
        while (iterator.hasNext()) 
        result = result + iterator.next();
        temp =bstring.values();
        iterator = temp.iterator();
        while (iterator.hasNext()) 
            result = result + iterator.next();
        
        return result;
    }

	public static void main(String[] args) throws IOException {
		String a = null;
		String b = null;
		System.out.println(makeAnagram(a,b));

	}
}
