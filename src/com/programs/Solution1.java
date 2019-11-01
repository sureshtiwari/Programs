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
	
	 private static int extremeInsertionIndex(int[] nums, int target, boolean left) {
	        int lo = 0;
	        int hi = nums.length;

	        while (lo < hi) {
	            int mid = (lo + hi) / 2;
	            if (nums[mid] > target || (left && target == nums[mid])) {
	                hi = mid;
	            }
	            else {
	                lo = mid+1;
	            }
	        }

	        return lo;
	    }

	    public static int[] searchRange(int[] nums, int target) {
	        int[] targetRange = {-1, -1};

	        int leftIdx = extremeInsertionIndex(nums, target, true);

	        // assert that `leftIdx` is within the array bounds and that `target`
	        // is actually in `nums`.
	        if (leftIdx == nums.length || nums[leftIdx] != target) {
	            return targetRange;
	        }

	        targetRange[0] = leftIdx;
	        targetRange[1] = extremeInsertionIndex(nums, target, false)-1;

	        return targetRange;
	    }

	public static void main(String[] args) throws IOException {
		int[] a = {1,2,4,4,4,4,4,4,4,5};
		int target = 4;
		int[] array = searchRange(a,target);
		System.out.println(array[0]);
		System.out.println(array[1]);
	}
}
