package Day01_Arrays;

public class BinarySearch {
	
	public static int binarySearch(int[] arr,int target) {
		
		int start=0;
		int n =arr.length;
		int end = n-1;
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(target>arr[mid]){
				start = mid+1;
			}else if(target<arr[mid]) {
				end = mid-1;
			}else {
				return mid;
			}
			
			
		}
		
		return -1;
	}
	public static void main(String[] args) {
		int [] arr = {-1,0,4,7,9,12};
		int target=12;
		int res = binarySearch(arr,target);
		System.out.println(res);
		

	}

}
