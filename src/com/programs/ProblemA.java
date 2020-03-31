package com.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int	n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			sc.nextLine();
			HashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
			for(int j=0;j<num;j++)
			{
				String s = sc.nextLine();
				if(!hm.containsKey(s))
					hm.put(s, 0);
				
			}
			ar.add(i, hm.size());
			hm.clear();
		}
		
		for (Integer integer : ar) {
			System.out.println(integer);
		}
		sc.close();
		

	}

}
