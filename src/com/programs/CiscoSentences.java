package com.programs;

import java.util.Arrays;
import java.util.List;

public class CiscoSentences {

// Function to print the sorted array of string 
// void printArraystring(string,int); 

// Function to Sort the array of string 
// according to lengths. This function 
// implements Insertion Sort. 
	static String sort(String sentence) {
		String[] s = sentence.split("\\W+");
		int n = s.length;
		for (int i = 1; i < n; i++) {
			String temp = s[i];
			int j = i - 1;
			while (j >= 0 && temp.length() < s[j].length()) {
				s[j + 1] = s[j];
				j--;
			}
			s[j + 1] = temp;
		}
		StringBuilder temp = new StringBuilder();
		for (int i = 0; i < s.length; i++) {
			temp.append(s[i]);
			temp.append(" ");
		}
		String temp1 = temp.toString();
		temp1 = temp1.trim();
		temp1 = temp1.toLowerCase();
		temp1 = temp1 + ".";
		String output = temp1.substring(0, 1).toUpperCase() + temp1.substring(1);
		return output;
	}

	static int droppedRequests(List<Integer> requestTime) {
		int tenwindow = 0;
		int minutewindow = 0;
		int currenttime=requestTime.get(0);
		int repeat = 1;
		int requestdropped=0;
		for(int i=1;i<requestTime.size();i++)
		{
			if(requestTime.get(i)==currenttime)
			{
				if(repeat == 3)
					requestdropped++;
				else
					repeat++;
			}
			else
			{
				currenttime = requestTime.get(i);
				repeat=1;
			}
		}
		return requestdropped;
	}

// Function to print the sorted array of string 
	static void printArraystring(String str[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(str[i] + " ");
	}

// Driver function 
	public static void main(String args[]) {
		System.out.println(droppedRequests(Arrays.asList(1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,11,11,11)));
	}

}
