package com.programs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZombieQuestionAnswer {
	
	public static void main(String[] args) {
		int[][] grid = { { 0, 1, 1, 0, 1 }, { 0, 1, 0, 1, 0 }, { 0, 0, 0, 0, 1 }, { 0, 1, 0, 0, 0 } };
	}

	private static int minDays(int rows, int columns, List<List<Integer>> grid) {
		Queue<int[]> q = new LinkedList<>();
		int target = grid.size() * grid.get(0).size();
		int cnt = 0, res = 0;
		for(int i=0;i<grid.size();i++) {
			for(int j=0;j<grid.get(0).size();j++) {
				if(grid.get(i).get(j) == 1) {
					q.offer(new int[] {i,j});
					cnt++;
				}
			}
		}
		int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
		while(!q.isEmpty()) {
			int size = q.size();
			if(cnt == target)
				return res;
			for(int i=0;i<size;i++) {
				int[] cur = q.poll();
				for(int[] dir : dirs) {
					int ni = cur[0] + dir[0];
					int nj = cur[1] + dir[1];
					if(ni >=0 && ni < grid.size() && nj >=0 && nj < grid.get(0).size() && grid.get(ni).get(nj) == 0) {
						cnt++;
						q.offer(new int[] {ni, nj});
						List<Integer> temp = grid.get(ni);
						temp.set(nj, 1);
						grid.set(ni, temp);
						
					}
				}
			}
			res++;
		}
		return -1;
	}


}
