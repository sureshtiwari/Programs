package com.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Result1 {

	/*
	 * Complete the 'findCompletePrefixes' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. STRING_ARRAY names 2. STRING_ARRAY query
	 */

	public void minimumBribes(int[] q) {
        int total=0;
        for(int i=0;i<q.length;i++)
        {
            
            int num = (q[i]-(i+1));
            if(num>2){
                    System.out.println("Too chaotic");
                    return;
            }
                
            else
            {
                total+=Math.abs(num);
            }

        }
        System.out.println(total/2);

    }



}
