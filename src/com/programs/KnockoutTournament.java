package com.programs;

import java.util.Scanner;

public class KnockoutTournament {
	
	public static void main(String [] args)
	{
		  // Write your code here
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int n=sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++)
            str[i]=sc1.nextLine();
        
        int qn=sc.nextInt();
        int[] l=new int[qn];
        int[] r=new int[qn];
        int[] k=new int[qn];
        for(int i=0;i<qn;i++)
        {
            l[i]=sc.nextInt();
            r[i]=sc.nextInt();
            k[i]=sc.nextInt();
        }
        
        for(int i=0;i<qn;i++)
        {
            StringBuilder sb = new StringBuilder();
            for(int j=l[i]-1;j<=r[i]-1;j++)
                sb.append(str[j]);
            
            String main= sb.toString();
            System.out.println(main.charAt(k[i]-1));
        }
        sc.close();
        sc1.close();
	}

}
