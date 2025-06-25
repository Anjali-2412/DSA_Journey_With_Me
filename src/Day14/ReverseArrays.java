package Day14;

import java.util.Arrays;

public class ReverseArrays {
 public static void main(String[] args) {
	 int[] arr= {10,20,30,40,50};
		
		int start =0;
		int end =arr.length-1;
		
		while(start<end) {
			//swap elements at start and end
			
			int temp = arr[start];// temp=10 at begining
			
			arr[start]=arr[end];//arr[0]=50 at begining
			
			arr[end] = temp;//arr[4]=10 so ={50,20,30,40,10}
			
			start++;
			end--;
		}
		
		System.out.println("Reversed Array : "+Arrays.toString(arr));
}
}
