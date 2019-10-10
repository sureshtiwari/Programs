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

public int compare(Player a, Player b) {
			
			if(a.score>b.score)
				return 1;
			if(a.score<b.score)
				return -1;
			if(a.score==b.score)
			{
				if(a.name.compareTo(b.name)>0)
					return 1;
				if(a.name.compareTo(b.name)<0)
					return -1;
				return 0;
			}
			return 0;		
    }

	public static void main(String[] args) throws IOException {

		int[] prices= {1,2,3,4};
		int k=7;
		System.out.println(maximumToys(prices, k));

	}
}
