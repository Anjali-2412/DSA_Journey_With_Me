package Preparation_Interview_Assesment;

public class MaxCircularRotationSubArraySum {
	
	

	    // Kadane’s algorithm -> max subarray sum for a given array
	    public static int kadane(int[] arr) {
	        int maxSoFar = arr[0];
	        int currMax = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            currMax = Math.max(arr[i], currMax + arr[i]);
	            maxSoFar = Math.max(maxSoFar, currMax);
	        }
	        return maxSoFar;
	    }

	    // Rotate array left by 1
	    public static void rotateLeft(int[] arr) {
	        int first = arr[0];
	        for (int i = 0; i < arr.length - 1; i++) {
	            arr[i] = arr[i + 1];
	        }
	        arr[arr.length - 1] = first;
	    }

	    public static int maxSumAfterRotations(int[] arr) {
	        int n = arr.length;
	        int maxSum = Integer.MIN_VALUE;

	        for (int r = 0; r < n; r++) {
	            // find max subarray sum of current rotation
	            int currMax = kadane(arr);
	            maxSum = Math.max(maxSum, currMax);

	            // rotate array for next iteration
	            rotateLeft(arr);
	        }

	        return maxSum;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, -1, 4};
	        int ans = maxSumAfterRotations(arr);
	        System.out.println("Maximum Subarray Sum after rotations = " + ans);
	    }
	}

	
	
	
	

