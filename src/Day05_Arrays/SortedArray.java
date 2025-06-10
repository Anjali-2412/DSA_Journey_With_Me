package Day05_Arrays;

public class SortedArray {
	public static void main(String[] args) {
		boolean isSorted = true;
		int[] a= {4,5,8,11,15,20};
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<a[i-1]) {
				isSorted=false;
				break;
			}
		}
		if (isSorted) {
			System.out.println("Array is sorted in ascending order");
		}
		else {
			System.out.println("Array is not sorted in ascending order");
		}
		
		//case 1: Best Case - 
		// loop breaks early
		//time complexity : o(1)
		
		//case 2: Worst case
		//need to check all n-1 adjacent pairs.
		//time complexity: o(n)
		
		//space complexity : o(1)
	}
}
