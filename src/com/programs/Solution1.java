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
	
	 public static int majorityElement(int[] nums) {
	        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	        for(int i=0;i<nums.length;i++)
	        {
	        	if(hm.containsKey(nums[i]))
	        	{
	        		hm.put(nums[i], hm.get(nums[i])+1);
	        	}
	        	else
	        	{
	        		hm.put(nums[i], 1);
	        	}
	        }
	        int answer=0;
	        int result = 0;
	        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			    if(entry.getValue()>result)
			    {
			    	answer = entry.getKey();
			    	result=entry.getValue();
			    }
			}
	        return answer;
	    }

	public static void main(String[] args) throws IOException {
		int[] a = {3,3,4};
		System.out.println(majorityElement(a));

	}
}
