package com.programs;

import java.io.*;
import java.util.*;



class Result {

    /*
     * Complete the 'minSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY num
     *  2. INTEGER k
     */

    public static int minSum(List<Integer> num, int k) {
    // Write your code here
    int sum=0;
    for(int i=0;i<k;i++){
        Collections.sort(num);
        float number = num.get(num.size()-1);
        number = Math.round(number/2F);
        num.add(num.size()-1, (int)number);
    }
    for(int j=0;j<num.size();j++){
        sum=sum+num.get(j);
    }
    return sum;

    }



}

public class MinimumSum {
    public static void main(String[] args) throws IOException {
        List<Integer> num = new ArrayList<Integer>();
        num.add(2);
        int k= 1;
        int result = Result.minSum(num, k);
        System.out.println(result);
        
    }
}
