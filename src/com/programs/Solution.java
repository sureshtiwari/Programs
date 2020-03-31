package com.programs;

public class Solution
{
	public static String maxSubstring(String s) {
	    // Write your code here
		char test='a';
		int index=0;
	    for(int i=0;i<s.length();i++)
	    {
	    	if(s.charAt(i)>test && s.charAt(i)!=test)
	    	{
	    		test=s.charAt(i);
	    		index=i;
	    	}
	    }
	    String result = s.substring(index, s.length());
	    return result;
	    }
}