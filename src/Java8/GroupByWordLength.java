package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByWordLength {
public static void main(String[] args) {
	
	
	List<String> words = Arrays.asList("apple","bat","bat","cat","bananna","cherry");
	
	Map<Integer,List<String>> gl = words.stream().collect(Collectors.groupingBy(String::length));
System.out.println(gl);

	Map<String,Long> w = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	w.forEach((word,count)->System.out.println(word+" : "+count));
	
	
	
	
	/*
	 * List<String> words = Arrays.asList("apple","bat","cat","banana","cherry");
	 * Map<Integer,List<String>> groupByLength = words.stream()
	 * .collect(Collectors.groupingBy(String::length));
	 * 
	 * System.out.println(groupByLength);
	 */
	
}
}
