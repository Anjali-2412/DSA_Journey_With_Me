package Map;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum(int[] arr,int target) {
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			int first =arr[i];
			int second = target - first;
			
			if(map.containsKey(second)) {
				return new int[] {map.get(second),i};
			}
			map.put(arr[i], i);
		}
		
		return new int[] {};
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,7,11,15};
		int target =18;
		
		int[] result = twoSum(arr, target);
		
		System.out.println("Indices : "
				+result[0]+", "+result[1]);
	}
}
