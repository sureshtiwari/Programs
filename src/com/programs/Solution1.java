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
	
	 public static int[] searchRange(int[] nums, int target) {
		 int[] result = new int[2];
		 int flag=0;
	      for(int i=0;i<nums.length;i++)
	      {
	    	  if(flag==0)
	    	  if(nums[i]==target)
	    	  {
	    		  result[0] = i;
	    		  flag=1;
	    	  }
	    	  if(flag==1)
	    		  if(nums[i]!=target)
                  { result[1] = i-1;break;}
	    	  
	      }
	      if(flag==0)
	      {
	    	  int[] array = {-1,-1};
	    	  return array;
	      }
	      return result;
	    }

	public static void main(String[] args) throws IOException {
		int[] a = {5,7,7,8,8,10};
		int target = 8;
		int[] array = searchRange(a,target);
		System.out.println(array[0] + array[1]);
	}
}
