package com.programs;

import java.util.Deque;
import java.util.LinkedList;

class DocodeString {
  static Deque<Integer> numStack = new LinkedList<>();
  static Deque<String> stringStack = new LinkedList<>();

  static StringBuilder result = new StringBuilder();

  private static boolean isNumber(char c) {
    return c >= '0' && c <= '9';  
  }

  public static String decodeString(String s) {
        
    for(int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if(isNumber(c)) {
        int start = i;
        while(s.charAt(++i) != '[');
        String num = s.substring(start, i);
        numStack.push(Integer.parseInt(num));

        start = i + 1;
        while(!isNumber(s.charAt(++i)) && s.charAt(i) != ']');
        String sub = s.substring(start, i--);
        stringStack.push(sub);
      } 
      else if (c == ']') {
        int num = numStack.pop();
        String sub = stringStack.pop();

        if(numStack.isEmpty()) {
          for(int j = 0; j < num; j++)
            result.append(sub);
        } else {
          StringBuilder tmp = new StringBuilder(stringStack.pop());
          for(int j = 0; j < num; j++)
            tmp.append(sub);
          stringStack.push(tmp.toString());
        }
      } 
      else {
        int begin = i;
        while(++i != s.length() && !isNumber(s.charAt(i)) && s.charAt(i) != ']');
        String sequence = s.substring(begin, i--);

        if(numStack.isEmpty())
          result.append(sequence);
        else {
          stringStack.push(stringStack.pop() + sequence);
        }
      }
    }

    return result.toString();
  }
  
  
  public static void main(String args[])
  {
	  String s = "2[abc]3[cd]ef";
	  System.out.println(decodeString(s));
  }
}