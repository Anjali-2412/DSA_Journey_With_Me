package Preparation_Interview_Assesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxCisSubArray {
	
	public static int maxSubaraaySum(List<Integer> list,int n) {
		
		n=list.size();
		int result = Integer.MIN_VALUE;
		for(int r=0;r<n;r++) {
			int maxSofar = list.get(0);
			int currentMax = list.get(0);
		
			for(int i=1;i<n;i++) {
			currentMax = Math.max(list.get(i), currentMax+list.get(i));
			maxSofar = Math.max(maxSofar, currentMax);
		}
		result  = Math.max(result, maxSofar);
		int first = list.remove(0);
		list.add(first);
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,-1,4));
		 int currMax = maxSubaraaySum(list,list.size());
		 System.out.println(currMax+"----");
			/*
			 * int result = Integer.MIN_VALUE; int n = list.size(); for (int i = 0; i < n;
			 * i++) { int currMax = maxSubaraaySum(list,list.size()); result =
			 * Math.max(currMax, result);
			 * 
			 * int first = list.remove(0); list.add(first);
			 * 
			 * 
			 * 
			 * } System.out.println(result);
			 */
		
		
	}
}
