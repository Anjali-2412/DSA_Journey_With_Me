package DSA_Interview;

public class ArraySearch {
	public int Search(int[] arr, int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		ArraySearch as = new ArraySearch();
		int arr[] = {31,23,343,44,35};
		System.out.println(as.Search(arr, 4));
		
	}
}
