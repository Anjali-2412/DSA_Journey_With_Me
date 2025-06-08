package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateElement {
public static void main(String[] args) {
	int[] arr1 = {1,2,3,4,5};
	int[] arr2 = {4,5,6,7,8};
	int[] merge = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
	
	Set<Integer> seen = new HashSet<>();
	
	Set<Integer> duplicate = Arrays.stream(merge)
			.filter(s->!seen.add(s)).boxed().collect(Collectors.toSet());
	System.out.println(duplicate);
}
}
