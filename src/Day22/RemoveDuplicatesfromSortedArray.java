package Day22;

public class RemoveDuplicatesfromSortedArray {
	
	public int removeDuplicates(int[] nums) {
	      
        if (nums.length == 0) return 0;

        int i = 0; // Slow pointer - tracks position to place unique number

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++; // move slow pointer
                nums[i] = nums[j]; // copy unique element to correct position
            }
        }

        return i + 1; // Total number of unique elements
    } 
    
	
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		RemoveDuplicatesfromSortedArray rm = new RemoveDuplicatesfromSortedArray();
		System.out.println(rm.removeDuplicates(arr));

	}

}
