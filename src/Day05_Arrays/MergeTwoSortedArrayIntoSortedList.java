package Day05_Arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrayIntoSortedList {
	/*
	 * Merge two sorted lists, resultant list should be sorted. For example, given
	 * following lists : a = {5, 8, 20} b = {4, 11, 15} The merged list should be :
	 * result = {4, 5, 8, 11, 15, 20}
	 */
	public static List<Integer> mergeSorted(int[] a,int[] b){
		
		List<Integer> merge = new ArrayList<>();
		int i=0,j=0;
		
		//Merge both arrays unto; one finishes
		while(i<a.length && j<b.length) {   // n=length of array b and m = length of array b :- o(n+m)
			if(a[i]<b[j]) {
				merge.add(a[i]);
				i++;
			}
			else {
				merge.add(b[j]);
				j++;
			}
		}
		//Add remaining elements from a (if any)
		while(i<a.length) {
			merge.add(a[i]);                            //o(n+m) 
			i++;
		}
		
		//Add remaining elements from b (if any)
		while(j<b.length) {
			merge.add(b[j]);							//o(n+m) 
			j++;
		}
		
		return merge;
	}
	
	public static void main(String[] args) {
		int[] a = {5,8,20};
		int[] b = {4,11,15};
		
		List<Integer> mergedList = mergeSorted(a, b);
		System.out.println("Merged List: "+mergedList);
	}
	
	//time complexity --- //o(n+m) 
}
