package Day02_Arrays;

public class LinearSearch {
	public static int linearSearch(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
	int[] arr= {23,3,4,5,6,43,66,76};
	int target = 66;
	int res = linearSearch(arr,target);
	System.out.println(res);
	
}

}
