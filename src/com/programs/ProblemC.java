package com.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ProblemC {

	public static void main(String[] args) {
		
		try {
		int count=0;
		String[] result= new String[100];
		InputStreamReader r1=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r1);  
		//Scanner scanner = new Scanner(System.in);
	    int n = Integer.parseInt(br.readLine());
		//int n = scanner.nextInt();
		int[] r = new int[n];
		int[] c = new int[n];
		for (int z = 0; z < n; z++) {
			//r[z] = scanner.nextInt();
			//c[z] = scanner.nextInt();
			//scanner.nextLine();
			String s = br.readLine();
			String[] s1=s.split(" ");
			r[z] =  Integer.parseInt(s1[0]);
			c[z] =  Integer.parseInt(s1[1]);
			String[] str = new String[r[z]];
			for (int i = 0; i < r[z]; i++) {
				str[i] = br.readLine();
			}
			
			int i, j = 0, flag = 0;
			int x, y;
			for (i = 0, x = 0; x < r[z]; i++, x++)
				for (j = 0, y = 0; y < c[z]; j++, y++)
					if (str[i].charAt(j) == '1') {
						x = r[z];
						break;
					}

			i--;
			if (i == r[z] && j == c[z])
				flag = 1;

			for (int k = 0; k < r[z]; k++)
				for (int l = 0; l < c[z]; l++)
					if (str[k].charAt(l) == '1' && k != i && l != j) {
						flag = 1;
						k = r[z];
						l = c[z];
						break;
					}
			
			int k,l = 0,flag2=0;
			out:
			for (k = 0; k < r[z]; k++)
				for (l = 0; l < c[z]; l++)
					if(str[k].charAt(l) == '1')
					{
						for(int p=0;p<str[k].length();p++)
						{
							if(str[k].charAt(p)=='1' && p!=k)
								{p=str[k].length();l=c[z];k=r[z];flag2=1;break out;}
						}
						
						for(int p=0;p<c[z];p++)
						{
							if(str[p].charAt(l)=='1' && p!=l)
								{p=r[z];l=c[z];k=r[z];flag2=1;break out;}
						}
					}
			
			if(k==r[z] && l==c[z] && flag2==0)
				flag=2;
			
			
			if(flag == 2)
				result[count++]="impossible";

			if(flag == 0)
				for (i = 0; i < r[z]; i++) {
					str[i] = str[i].replaceAll("1", "P");
					str[i] = str[i].replaceAll("0", "N");
					result[count] = str[i];
					count++;
				}
			if(flag == 1)
				for (i = 0; i < r[z]; i++) {
					str[i] = str[i].replaceAll("1", "I");
					str[i] = str[i].replaceAll("0", "N");
					result[count] = str[i];
					count++;
				}
			
			
			
			
			
			result[count] = "----------";
			count++;


		}

		
			
		for (int i = 0; i <count; i++) {
			System.out.println(result[i]);
		}

		//scanner.close();
	
			r1.close();
			br.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
