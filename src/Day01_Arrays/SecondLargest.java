package com.dsa.day01;

public class SecondLargest {
	
	public static int SecondLargestElement(int[] ar) {
		if(ar ==null) {
			return -1;
		}
		int max1=Integer.MIN_VALUE;
		int max2= Integer.MAX_VALUE;
		for(int num : ar) {
			if(num>max1) {
				max2=max1;
				max1=num;
			}
			else if(num>max2 && num!=max1) {
				max2 =num; 
			}
		}
		return max2==Integer.MIN_VALUE ? -1 : max2;
	}
	
	
	public static void main(String[] args) {
		int[] ar = {23,23,23,0,1,45,45,54,54};
		int res =SecondLargestElement(ar);
		System.out.println(res);

	}

}
