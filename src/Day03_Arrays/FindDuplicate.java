package Day03_Arrays;

import java.util.HashSet;

public class FindDuplicate {
public static void main(String[] args) {
	
	int arr[] = {1,1,1,4,5,3,2,2,2,2,2,4,5,3,2};
	HashSet<Integer> seen  = new HashSet<>();
	HashSet<Integer> duplicates  = new HashSet<>();
	
	
	 for(int num : arr) {
		 if(!seen.add(num)) {
			 duplicates.add(num);
			
		 }
	 }
	 System.out.println("Duplicates values are :");
	 for(int num : duplicates) {
		 System.out.println(num);
	 }
}
}
