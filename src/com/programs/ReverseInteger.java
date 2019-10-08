package com.programs;

class ReverseInteger {
    public static int reverse(int x) {
        int temp=x;
        int sum=0;
        while(temp!=0)
        {
            int num = temp%10;
            sum = sum * 10 + num;
            temp/=10;
            
        }
        return sum;
            
    }
    public static void main(String args[])
    {
    	int test = 1534236469;
    	System.out.println(reverse(test));
    }
}