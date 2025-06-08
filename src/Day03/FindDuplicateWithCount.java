package Day03;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWithCount {
public static void main(String[] args) {
	int[] arr = {1,1,1,1,4,5,3,2,2,2,2,4,5,3,2};
	HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
	//count frequency of each number
	for(int num : arr) {
		countMap.put(num, countMap.getOrDefault(num, 0)+1);
	}
	
	System.out.println("duplicates elements are : ");
	for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
		System.out.println("value: "+entry.getKey()+" count: "+entry.getValue());
	}
	
}
}
