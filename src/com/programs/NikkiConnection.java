package com.programs;

import java.util.*;
	public class NikkiConnection {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Nikki's start and end time:");
		int starttime = scan.nextInt();
		int endtime = scan.nextInt();
		String resultname = "";
		int resultstarttime = Integer.MAX_VALUE;
		int resultendtime = 0;
		int resultduration = 0;
		System.out.println("Enter Employee name, start time and end time:");
		char choice = 'y';
		do
		{
			String name = scan.next();
			int empstartime = scan.nextInt();
			int empendtime = scan.nextInt();
			if((!(endtime<=empstartime) && !(starttime>=empendtime))) {
				int duration = Math.min(endtime, empendtime) - Math.max(starttime, empstartime);
				if(Math.min(endtime, empendtime) - Math.max(starttime, empstartime)>=30 && resultduration<=duration)
				{
					
					if(resultduration==duration)
					{
						if(resultstarttime>empstartime)
						{
							resultname=name;
							resultstarttime=empstartime;
							resultendtime=empendtime;
							resultduration=duration;
						}
					}
					else
					{
						resultname=name;
						resultstarttime=empstartime;
						resultendtime=empendtime;
						resultduration=duration;
					}
				}
			}
			System.out.println("want to enter more employee details(Y for yes, N for no):");
			choice = scan.next().charAt(0);
		}while(choice=='y' || choice=='Y');
		
		System.out.println("Nikki Can have lunch with "+resultname + " start time="+resultstarttime+ " endtime="+resultendtime);
		scan.close();
	}
}