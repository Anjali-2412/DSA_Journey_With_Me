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
