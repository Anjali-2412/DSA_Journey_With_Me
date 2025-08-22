package Preparation_Interview_Assesment;

import java.util.Scanner;

public class CircularDifference {
	static final int MOD=1000000007;
	
	public static int circularArray(int[] A) {
		int n = A.length;
		int[] B = new int[n];
		
		if(n==2) {
			B[0]=0;
			B[1]=0;
		}
		else {
			for(int i=0;i<n;i++) {
				int left = (i-1+n)%n;
				int right = (i+1)%n;
				
				System.out.println("for i = "+i);
				System.out.println("left index = "+left+", value = "+A[left]);
				System.out.println("right index = "+right+", value = "+A[right]);
				
				B[i] =Math.abs(A[left]-A[right]);
				System.out.println("B["+i+"] = |"+A[left]+" - "+A[right]+"| = "+B[i]);
				System.out.println("--------------------------");
				
				
			
			}
		}
		
		long sum=0;
		for(int i=0;i<n;i++) {
			sum = (sum+ ( B[i]^i)%MOD);
			
		}
		return (int) sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] A = new int[n];
		for(int i=0;i<n;i++) {
			
			A[i]=sc.nextInt();
		}
		int resilt = circularArray(A);
		System.out.println("final answer = "+resilt);
		
		
		
		
	}
}
