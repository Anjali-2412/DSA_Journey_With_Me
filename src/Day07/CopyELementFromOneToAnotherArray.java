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

/*Time Complexity:
You have two separate loops, each running n times, where n is the length of the array:

Copying elements loop:
Runs n times ⇒ O(n)

Printing elements loop:
Runs n times ⇒ O(n)

But they are not nested, so total time complexity is:

             O(n)+O(n)=O(n)
​
 
Space Complexity: O(n)
You are creating a new array of the same size.

*/

​
 
