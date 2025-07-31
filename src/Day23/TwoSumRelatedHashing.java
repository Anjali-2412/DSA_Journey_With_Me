package Day23;

import java.util.HashMap;

public class TwoSumRelatedHashing {
	
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			int second = target - nums[i];
			
			
			if(map.containsKey(second)) {
				return new int[] {map.get(second),i};
			}
			
			map.put(nums[i], i);
			
			
		}
		return new int[] {};
	}
	
	public static void main(String[] args) {
		 
		int[] nums = {2,7,11,15};
		int target = 9;
		int [] result = twoSum(nums, target);
		if(result.length==2) {
			System.out.println("Indices : "+result[0]+", "+result[1]);
			
		}else {
			System.out.println("no pair found");
		}
	}
}
