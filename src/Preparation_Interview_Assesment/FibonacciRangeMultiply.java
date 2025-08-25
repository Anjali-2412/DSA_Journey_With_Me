package Preparation_Interview_Assesment;

import Day17.fibonaccieSeries;

public class FibonacciRangeMultiply {
		public static long generateFibonacii(int start, int end) {
			if(start > end )return -1; // invalid range
			long product =1;
			int first=0,second=1;
			
			for(int i=0;i<=end;i++) {
				int next;
				if(i==0) {
					next=0;
				}else if(i==1) {
					next=1;
				}else {
					next = first + second;
					first = second;
					second = next;
				}
				
				//Multiply only if index is within the range
				if(i >= start) {
					product =product*next;
				}
			}
			return product;
		}
		public static void main(String[] args) {
			int startIndex = 5 , endIndex = 4 ;
			long result = generateFibonacii(startIndex, endIndex);
			System.out.println("product of Fibonacci numbers from "
			+ startIndex + " to " + endIndex + " = " + result);
		}
}
