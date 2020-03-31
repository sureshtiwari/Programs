package com.programs;



public class Solution1 {

	public static float median(int[] array) {
		float median = 0;
		int center = array.length / 2;
		if (array.length % 2 == 0) {
			median = (float) ((array[center-1] + array[center]) / 2.0);
		} else {
			return array[center];
		}
		return median;
	}

	public static int[] mergeArray(int[] num1, int[] num2) {
		int i ,j ,k ;
		int[] mergedlist = new int[num1.length + num2.length];
		/*if (num1 == null)
			//return num2;
		else if (num2 == null)
			//return num1;*/
		for (i = 0, j = 0, k = 0; i < num1.length + num2.length; i++) {
			if (j < num1.length && k < num2.length) {
				if (num1[j] <= num2[k] && j < num1.length) {
					mergedlist[i] = num1[j];
					j++;
				} else {
					mergedlist[i] = num2[k];
					k++;
				}
			}
			else
				break;
		}
		
		if(j<num1.length)
			for(;j<num1.length;j++)
				mergedlist[i++] = num1[j];
		if(k<num2.length)
			for(;k<num2.length;k++)
				mergedlist[i++] = num2[k];

		return mergedlist;
	}

	public static void main(String[] args) {
		int[] num1 = { 1, 3};
		int[] num2 = { 2 };
		int[] mergedarray = mergeArray(num1, num2);
		float median = median(mergedarray);
		System.out.println(median);
	}
}
