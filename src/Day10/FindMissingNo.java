package Day10;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNo {
	public static void main(String[] args) {
		
			int[] arr = {1,2,5,6};
			int n=6;
			Set<Integer> set = new HashSet<>();
			for(int num : arr) {
			set.add(num);
			}
			System.out.println("Missing no are : ");
			for(int i=1;i<=n;i++) {
				if(!set.contains(i)) {
					System.out.println(i);
				}
			}
		
	}
}
