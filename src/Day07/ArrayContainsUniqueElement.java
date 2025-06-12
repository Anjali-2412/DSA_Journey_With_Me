package Day07;

public class ArrayContainsUniqueElement {
	public static void main(String[] args) {
		int[] arr = {10,20,20,30,40,50};//Try changing element using duplicate value
		boolean isUnique = true;
		
		//Compare each element with every other element
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					isUnique=false;
					break;
				}
			}
			if (!isUnique) break;
				
			
	}
		//print
		if (isUnique) {
			System.out.println("Array contains only unique values.");
		}
		else {
			System.out.println("Array contains duplicate values.");
		}
	}
}

//Best Case: o(1)
//In the best case, a duplicate is found at the beginning 
//(e.g., arr[0] == arr[1])

//Worst case : o(n2)
//when there are no duplicates, the inner loop runs fully each time.

//Space Complexity: 𝑂(1)
//You're not using any additional data structures, so:

