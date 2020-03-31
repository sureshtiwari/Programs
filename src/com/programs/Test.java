package com.programs;

import java.util.Scanner;

public class Test {

	public static int main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int n = sc.nextInt();
		int[] cprice = new int[c];
		int[] cweight = new int[c];
		for(int i=0;i<c;i++)
		{
			cprice[i]=sc.nextInt();
			cweight[i]=sc.nextInt();
		}
		int[] nprice = new int[n];
		int[] nweight = new int[n];
		for(int i=0;i<n;i++)
		{
			nprice[i]=sc.nextInt();
			nweight[i]=sc.nextInt();
		}
		int sold=0;
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(nprice[j]!=0)
				{
					if(cprice[i]>=nprice[j])
					{
						if(cweight[i]>nweight[j])
						{
							sold++;
							nprice[j]=0;
						}
					}
				}
			}
		}
		return sold;
		
	}

}
