package Day24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateAndMissing {
	public static int[] findDuplicateAndMissing(int[][] grid) 
	{
		int n = grid.length;
		int totalElement = n*n;
		
		Set<Integer> seen = new HashSet<>();
		int duplicate =-1;
		int actualSum=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int num = grid[i][j];
				actualSum=actualSum+num;
				
				
				
				if(seen.contains(num)) {
					duplicate=num;
				}else {
					seen.add(num);
				}
			}
		}
		
		int expectedSum = totalElement * (totalElement+1)/2;
		
		int missing  = expectedSum + duplicate - actualSum;
		
		return new int[] {duplicate,missing};
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		int[][] grid= {
				{1,3},
				{2,2}
		};
		int[] result = findDuplicateAndMissing(grid);
		System.out.println(Arrays.toString(result));
	}
}
