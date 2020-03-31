package com.programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Macafee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int n = sc.nextInt();
		int[] cprice = new int[c];
		int[] cweight = new int[c];
		for (int i = 0; i < c; i++) {
			cweight[i] = sc.nextInt();
			cprice[i] = sc.nextInt();
		}
		int[] nprice = new int[n];
		int[] nweight = new int[n];
		for (int i = 0; i < n; i++) {
			nweight[i] = sc.nextInt();
			nprice[i] = sc.nextInt();
		}
		int sold = 0;
		int[][] result = new int[c][n];
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = 0;
			}
		}
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < n; j++) {
				if (cprice[i] >= nprice[j]) {
					if (cweight[i] < nweight[j]) {
						result[i][j] = 1;
					}
				}
			}
		}
		LinkedHashMap<Integer, Integer> cricketerfreq =  new LinkedHashMap<Integer, Integer>();
		
		for (int i = 0; i < c; i++) {
			int temp = 0;
			for (int j = 0; j < n; j++) {
				temp += result[i][j];
			}
			cricketerfreq.put(i, temp);
		}
		
		sc.close();
		System.out.println(sold);

	}
	
	
}
