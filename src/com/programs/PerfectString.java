package com.programs;

import java.io.*;
import java.util.*;


public class PerfectString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_arr = br.readLine().split(" ");
         int[] arr = new int[N];
         for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
         {
         	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
         }

         int out_ = solve(arr);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static int solve(int[] arr){
        // Write your code here
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        if(arr.length<10)
        return -1;
        for(int i=0;i<arr.length;i++)
        {
            if(i>10)
            {
                if(hashmap.containsKey(arr[i]))
                {
                    if(hashmap.size()==10)
                    {
                        return i+1;
                    }
                }
                else
                {
                    hashmap.put(arr[i],arr[i]);
                }
            }
        }
    return -1;
    }
}