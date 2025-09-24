package DSA_Interview;

public class BinarSearch {
	public static int Search(int arr[],int target) {
		int left =0,right =arr.length-1;
		
		while(left<=right) {
			int mid = left + (right - left)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target){
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
	
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println(Search(arr,4));
	}
}
