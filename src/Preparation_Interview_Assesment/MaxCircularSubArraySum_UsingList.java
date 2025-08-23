package Preparation_Interview_Assesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxCircularSubArraySum_UsingList {
	 // Kadane’s algorithm to find max subarray sum
    public static int maxSubarraySum(List<Integer> list) {
        int maxSoFar = list.get(0);
        int currentMax = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            currentMax = Math.max(list.get(i), currentMax + list.get(i));
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, -1, 4));
        int n = list.size();
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentMax = maxSubarraySum(list);
            result = Math.max(result, currentMax);

            // --- Rotate Left inline ---
            int first = list.remove(0);
            list.add(first);
        }

        System.out.println("Maximum Subarray Sum after rotations: " + result);
    }
}
