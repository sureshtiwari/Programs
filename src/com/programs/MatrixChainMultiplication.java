package com.programs;

class MatrixChainMultiplication {
    
    public static int matrixChainOrder(int arr[], int i, int j)
    {
        int min = Integer.MAX_VALUE;
        int count;
        if(i==j)
        return 0;
        
        for(int k=i;k<j;k++)
        {
            count=matrixChainOrder(arr,i,k)+matrixChainOrder(arr,k+1,j)+arr[i-1]*arr[k]*arr[j]; 
            if(min>count)
            min=count;
        }
        return min;
        
    }
	public static void main (String[] args) {
		//code
		int matrix[] = {1,2,3,4} ;
		int size=matrix.length;
		
		System.out.println(matrixChainOrder(matrix,1,size-1));
	}
}