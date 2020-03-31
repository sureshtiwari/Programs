package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoldmanSachs {
	static int result=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number = {123,123,131,987,999,1234,11243,20143,2314567};
		System.out.println(findQualifiedNumbers(number));

	}
	
	
static String findQualifiedNumbers(int[] numberArray) {
	boolean one=false, two=false, three=false;
	List<Integer> result = new ArrayList<Integer>();
	for(int i =0;i<numberArray.length;i++)
	{
		int num = numberArray[i];
		while(num!=0)
		{
			int n = num % 10;
			num=num/10;
			if(n==1)
				one = true;
			if(n==2)
				two = true;
			if(n==3)
				three = true;
			if(one && two && three)
			{
				result.add(numberArray[i]);
				break;
			}
		}
		one=false;two=false;three=false;
	}
	if(result.size()==0)
		return Integer.toString(-1);
	Collections.sort(result);
	StringBuilder str = new StringBuilder();
	for(int i=0;i<result.size();i++)
	{
		str = str.append(Integer.toString(result.get(i)));
		str = str.append(",");
	}
	String res = str.toString();
	res = res.substring(0, res.length()-1);
	return res;

        

    }


static int getCountOfPossibleTeams(List<Integer> coders) {
	getAns(coders);
	return GoldmanSachs.result;
	
}


private static void getAns(List<Integer> coders) {
	// TODO Auto-generated method stub
	for(int i =0;i<coders.size();i++)
	{
		getmaxpair(coders,1,i);
	}
}




private static void getmaxpair(List<Integer> integer, int i, int i2) {
	// TODO Auto-generated method stub
	
}

}
