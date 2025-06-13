package Day08;

import java.util.HashSet;

public class FindDuplicateUsingHashSet {
	public static void main(String[] args) {
		int[] arr = {2,2,3,4,1,1,3,4,5,5};
		HashSet<Integer> seen = new HashSet<Integer>();
		HashSet<Integer> duplicate = new HashSet<Integer>();
		
		for(int num : arr) {
			if(!seen.add(num)) {
				duplicate.add(num);
			}
		}
		
		if(duplicate.isEmpty()) {
			System.out.println("Duplicate values : None");
		}else {
		
		System.out.println("Duplicates values : ");
		for(int num : duplicate) {
			System.out.print(num+" ");
		}
		}
		
		
		//time complexity = o(1)
		//space = o(n) as two hashset seen and duplicate
	}
}
