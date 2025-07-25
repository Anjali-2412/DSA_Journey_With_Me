package Day15;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution_LeetCode_Q1 {
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			int complement = target - nums[i];
			
			//check if complement already exists in map
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
				
			}
			
			//store current number and its index
			map.put(nums[i], i);
			System.out.println(map.get(2));
				
		}
		
		//If no solution found(as per problem it always exists)
		return new int[]{-1,-1};	
		}
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target =9;
		int[] result = twoSum(nums,target);
		System.out.println("Indices : "+result[0]+" , "+result[1]);
	}
	
	
	//time complexity = o(n) -> very fast!
}
