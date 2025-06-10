package Java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoSortedArrayIntoSortedListUsingStream {
public static void main(String[] args) {
	
	int[] a = {5,8,20};
	int[] b = {4,11,15};
	
	int[] merge = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
						   .sorted()
						   .toArray();
	
	/*
	 * 1. Arrays.stream(a) and Arrays.stream(b) so o(n) for a and o(m) for b =>
	 * total: o(n+m) 2. IntStream.concat(,)====>> o(n+m) 3. .sorted() ====> must
	 * sort all(n+m) and java uses Timsort , worst-case time complexity of o(klog k)
	 * where k=n+m 4. .toArray() ===> convert sorted Stream into an array => o(n+m)
	 * 
	 * 
	 * 
	 * 5.overal time complexity => o((n+m) log(n+m)) i.e slower
	 */
	
	for(int num : merge) {
		System.out.print(num+" ");
	}
	
	
}
}
