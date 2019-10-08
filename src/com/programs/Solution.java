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

public class Solution {

	static long aVeryBigSum(long[] ar) {
        long sum=0;
        for(int i=0;i<ar.length;i++)
        	sum+=ar[i];
        
        return sum;
    }

	public static void main(String[] args) throws IOException {
		
    	String magazine= "apgo clm w lxkvg mwz elo bg elo lxkvg elo apgo apgo w elo bg";
    	String[] MagArray = magazine.split(" ");
    	String note= "elo lxkvg bg mwz clm w";
    	String[] notearray = note.split(" ");
        checkMagazine(MagArray, notearray);

     

}
}
