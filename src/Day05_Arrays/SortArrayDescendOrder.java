package Day05_Arrays;

public class SortArrayDescendOrder {
		public static void main(String[] args) {
			int[] arr = {5,2,9,1,7};
			for(int i=0;i< arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					//swap if next element is greater
					if(arr[j] > arr[i]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
					
					
				}
			}
			
			//print sorted array
			System.out.println("Arrays in descending order : ");
			for(int num : arr) {
				System.out.print(num+" ");
			}
		}
}
