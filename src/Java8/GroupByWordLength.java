package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByWordLength {
public static void main(String[] args) {
	List<String> words = Arrays.asList("apple","bat","cat","banana","cherry");
	Map<Integer,List<String>> groupByLength = words.stream()
											.collect(Collectors.groupingBy(String::length));
										
	System.out.println(groupByLength);
	
}
}
