package Day07;

public class RemoveEverySecondElement {
	public static void main(String[] args) {
		int[] original = {10,20,30,40,50,60,70};
		int newSize = (original.length+1)/2;
		int[] result = new int[newSize]; 
		
		int index=0;
		
		for(int i=0;i<original.length;i+=2) { 
			result[index] = original[i];
			index++;
		}
		
		System.out.println("Array after removing every seond element : ");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
		
	}
}
