package com.programs;

public class ContourSkyline {

	public static void main(String[] args) {
		int[][] grid = { {3, 0, 8, 4}, 
		                 {2, 4, 5, 7},
		                 {9, 2, 6, 3},
		                 {0, 3, 1, 0} };
		
		System.out.println(maxIncreaseKeepingSkyline(grid));

	}
	    public static int maxIncreaseKeepingSkyline(int[][] grid) {
	    	
	        int result = 0;
	        int[] row = new int[grid[0].length];
	        int[] clumns = new int[grid.length];
	        for(int i=0;i<grid.length;i++)
	        {
	        	row[i]=grid[i][0];
	        	clumns[i]=grid[0][i];
	        	for(int j=0;j<grid[0].length;j++)
	        	{
	        		if(row[i]<grid[i][j])
	        			row[i]=grid[i][j];
	        		if(clumns[i]<grid[j][i])
	        			clumns[i]=grid[j][i];
	        	}
	        }
	        for(int i=0;i<grid.length;i++)
	        {
	        	for(int j=0;j<grid[0].length;j++)
	        	{
	        		int height = Math.min(row[i], clumns[j]);
	        		result = result + (height - grid[i][j]);
	        	}
	        }
	        
	        return result;
	    }

}
