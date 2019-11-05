package com.programs;

import java.io.*;

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution1 {
	
	 static String isValid(String s) {
		 	HashMap<Character, Integer> hm =  new HashMap<Character, Integer>();
		 	for(int i=0;i<s.length();i++)
		 	{
		 		Character c = s.charAt(i);
		 		if(hm.containsKey(c))
		 			hm.put(c, hm.get(c)+1);
		 		else
		 			hm.put(c, 1);
		 	}
		 	HashMap<Integer, Integer> fre = new HashMap<Integer, Integer>();
		 	for(Map.Entry<Character, Integer> entry : hm.entrySet())
		 	{
		 		if(fre.containsKey(entry.getValue()))
		 			fre.put(entry.getValue(), fre.get(entry.getValue())+1);
		 		else
		 			fre.put(entry.getValue(), 1);
		 	}

	    }

	public static void main(String[] args) throws IOException {
		int[] a = {1,2,4,4,4,4,4,4,4,5};
		int target = 4;
		int[] array = searchRange(a,target);
		System.out.println(array[0]);
		System.out.println(array[1]);
	}
}
