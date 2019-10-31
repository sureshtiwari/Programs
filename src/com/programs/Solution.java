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

	public static List<String> usernamesSystem(List<String> u) {
		// Write your code here
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < u.size(); i++) {
			if (hashmap.containsKey(u.get(i))) {
				for (int j = 1; j <= 99; j++) {
					String newUsername = u.get(i) + Integer.toString(j);
					if (!hashmap.containsKey(newUsername)) {
						hashmap.put(newUsername, i);
						result.add(newUsername);
						break;
					}
				}
			} else {
				hashmap.put(u.get(i), i);
				result.add(u.get(i));
			}
		}
		return result;
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
