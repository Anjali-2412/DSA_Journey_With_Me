package Day07;

import java.util.Scanner;

public class CopyELementFromOneToAnotherArray {
	public static void main(String[] args) {
		int[] original = {10,20,30,40,50};
		
		//Create another array with same length
		
		int[] copy= new int[original.length];
		
		//copy element manually
		for(int i=0;i<original.length;i++) {
			copy[i]=original[i];
			
		}
		//display copied array
		System.out.println("copied Array");
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]+" ");
		}
	
}}
