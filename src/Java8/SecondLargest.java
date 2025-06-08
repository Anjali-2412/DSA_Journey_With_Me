package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class SecondLargest {
public static int secondLargest(int[] arr) {
	
	
	return Arrays.stream(arr)
			.boxed()
			.distinct()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst().orElse(-1);
}
public static void main(String[] args) {
	int arr[] = {2,4,5,6,7,34,35};
	int result = secondLargest(arr);
	System.out.println(result);
}
}
