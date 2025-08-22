package Preparation_Interview_Assesment;

import java.util.Scanner;

public class MissingKeyBoard {
	
	public static int missingKeyboards(int[] arr) {
		
		int n = arr.length;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		//find min and max
		
		for(int num : arr) {
			if(num<min) min=num;
			if(num>max) max=num;
		}
		
		//total keyboards expected in the full series
		int totalExpected = max-min+1;
		
		//missing = expected - actual Present
			
		return totalExpected-n;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("hiii");
		System.out.println("output is - "+missingKeyboards(arr));
		
	}
}
