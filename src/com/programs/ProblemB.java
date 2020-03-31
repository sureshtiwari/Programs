package com.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				HashMap<Character, String> hm = new LinkedHashMap<Character, String>();
				hm.put('a', "@");
				hm.put('b', "8");
				hm.put('c', "(");
				hm.put('d', "|)");
				hm.put('e', "3");
				hm.put('f', "#");
				hm.put('g', "6");
				hm.put('h', "[-]");
				hm.put('i', "|");
				hm.put('j', "_|");
				hm.put('k', "|<");
				hm.put('l', "1");
				hm.put('m', "[]\\/[]");
				hm.put('n', "[]\\[]");
				hm.put('o', "0");
				hm.put('p', "|D");
				hm.put('q', "(,)");
				hm.put('r', "|Z");
				hm.put('s', "$");
				hm.put('t', "']['");
				hm.put('u', "|_|");
				hm.put('v', "\\/");
				hm.put('w', "\\/\\/");
				hm.put('x', "}{");
				hm.put('y', "`/");
				hm.put('z', "2");
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine();
				StringBuilder sb = new StringBuilder();
				for(int i=0;i<input.length();i++)
				{
					Character c = input.charAt(i);
					char lowerCase = Character.toLowerCase(c);
					if(hm.containsKey(lowerCase))
						sb.append(hm.get(lowerCase));
					else
						sb.append(lowerCase);
					
				}
				System.out.println(sb.toString());
				sc.close();

	}

}
