package Day25;

public class FindDuplicateNum {
	public static int findDuplicate(int[] arr) {
		int slow = arr[0];
		int fast = arr[0];
		
		do {
			slow = arr[slow]; //+1
			fast = arr[arr[fast]]; //+2

		}while(slow != fast);
		
		slow =arr[0];
		while(slow!=fast) {
			slow = arr[slow];
			fast = arr[fast];
		}
		
		return slow; //or fast both arr same
			
	}
	
	
	
	public static void main(String[] args) {
		int[] nums = {3,1,3,4,2};
		System.out.println("Duplicate num :"+findDuplicate(nums));
	}
}
