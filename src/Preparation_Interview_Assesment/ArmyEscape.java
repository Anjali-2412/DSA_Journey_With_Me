package Preparation_Interview_Assesment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmyEscape {
		static int[] dx = {0,0,1,-1};
		static int[] dy = {1,-1,0,0};
		public static int countPaths(List<List<Integer>> grid ,int n) {
			
			boolean[][] visited = new boolean[n][n];
			return dfs(grid,0,0,visited,n);
		}
		private static int dfs(List<List<Integer>> grid , int i ,int j, boolean[][] visited , int n) {
			if(i < 0 || j < 0 || i >= n|| j >= n || grid.get(i).get(j) == 1 || visited[i][j]) {
				return 0;
			}
			if(i == n -1 && j == n -1) {
				return 1;
			}
			
			visited[i][j] = true;
			int paths = 0;
			
			for(int d =0 ;d < 4 ;d++) {
				paths = paths + dfs(grid,i + dx[d], j + dy[d], visited ,n);
			}
			
			visited[i][j]= false;
			return paths;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			
			List<List<Integer>> grid = new ArrayList<>();
			
			for(int i = 0; i < n; i++) {
				List<Integer> row = new ArrayList<>();
				for(int j =0;j < n ;j++) {
					row.add(sc.nextInt());// input 0 or 1
				}
				grid.add(row);
			}
			
			System.out.println(countPaths(grid, n));
		}
}
