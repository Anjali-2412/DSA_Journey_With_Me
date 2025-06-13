package Day08;

import java.util.Arrays;

public class FindDuplicateAfterSorting {
	public static void main(String[] args) {
		int[] arr = {4, 2,4,4,2,2,2,2,2,2,2 ,7, 3, 2, 4, 9, 1, 3};
		
		//sort the array first 
		Arrays.sort(arr);
		System.out.println("After sorting given array : ");
		System.out.println(Arrays.toString(arr));;
		
		System.out.println("Duplicate values : ");
		boolean hasDuplicates = false;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] == arr[i-1]) {
				if(i==1 || arr[i] != arr[i-2]) {
					System.out.print(arr[i]+" ");
					hasDuplicates = true;
				}
				
				
			}
		}
		
		
		
		
		
		if(!hasDuplicates) {
			System.out.println("None");
		}
		
	}//time complexity - o(n log n)
	//space = o(1)
}
