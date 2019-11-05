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

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class Solution {

	 public String dayOfTheWeek(int d, int m, int y) {
	        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
	        y -= (m < 3) ? 1 : 0; 
	        int result = ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7; 
	        switch(result)
	        {
	        case 0:return "Sunday";
	        case 1:return "Monday";
	        case 2:return "Tuesday";
	        case 3:return "Wednesday";
	        case 4:return "Thrusday";
	        case 5:return "Friday";
	        case 6:return "Saturday";
	        }
	        return "";
	    }

	public static void main(String[] args) throws IOException {

		ArrayList<String> u= new ArrayList<>();
		u.add("alex");
		u.add("xylos");
		u.add("alex");
		u.add("alan");
		System.out.println(usernamesSystem(u));

	}
}
