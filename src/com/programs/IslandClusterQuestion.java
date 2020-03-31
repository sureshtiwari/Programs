package com.programs;

public class IslandClusterQuestion {

	class Solution {
	    
	    public int numIslands(char[][] grid) {
	        int count=0;
	        if(grid.length==0 || grid[0].length==0)return count;
	        for(int i=0; i<grid.length; i++){
	            for(int j=0; j<grid[0].length; j++){
	                if(grid[i][j]=='1'){
	                    help(i,j,grid);
	                    count++;
	                }
	            }
	        }
	        return count;
	    }
	    
	    public void help(int i, int j, char[][] grid){
	        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length)return;
	        if(grid[i][j]=='0' || grid[i][j]==2) return;
	        grid[i][j]=2;
	            help(i,j+1,grid);
	            help(i,j-1,grid);
	            help(i+1,j,grid);
	            help(i-1,j,grid);
	        
	    }
	}
	
}
