package Day07;

public class FindIndexOfArrayElement {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int target = 30;  //Element to find
		
		int index = -1;
		
		//Loop through the array to find the target element
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				index = i;
				break; //stop searching once found
			}
			
		}
		
		//display result
		if(index != -1) {
			System.out.println("Element "+target+" found at index : "+index);
		}
		else {
			System.out.println("Element "+target+" not found at index : "+index);
		}
		
	}
}
//time complexity : o(1) ---> Best case
//Worst case ---> o(n)
