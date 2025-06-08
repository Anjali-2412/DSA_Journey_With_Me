package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeStreamMethod {
public static void main(String[] args) {
	
	//Grouped By word Length============================================
	
	List<String> words = Arrays.asList("apple","cherry","grapes","mongo","cat","bat","owl");
	
	Map<Integer,List<String>> groupByLength = words.stream()
									.collect(Collectors.groupingBy(String::length));
	System.out.println(groupByLength);
	
	//sorting By length=================================================== 
	
	words.sort(Comparator.comparingInt(String::length));
	System.out.println(words);
	
	//sorting alphabetically ============================================
		
	Collections.sort(words);
	System.out.println(words);
	
	//Filter words Starting with "b"======================================
	
	words.stream()
	.filter(s->s.startsWith("b")).forEach(System.out::println);
	
	//Convert all in upper case ==============================================
	
	words.stream().map(s->s.toUpperCase()).forEach(System.out::println);
	
	//convert all in lower case===============================================
	
	words.stream().map(s->s.toLowerCase()).forEach(System.out::println);
	
	//find shortest and longest word=============================================
	
	String longest = words.stream()
			.max(Comparator.comparingInt(String::length)).orElse("no words");
	System.out.println("longest word : "+longest);
	
	//find shortest word ======================================================
	String lowest =words.stream()
			.min(Comparator.comparingInt(String::length)).orElse("no words");
	System.out.println("lowest words : "+lowest);
	
	//check the words present or not!!!=========================================
	
	System.err.println(words.contains("cat"));
	
	//Count words longer than 3 char=============================================
	
	long count = words.stream()
			.filter(s->s.length()>3).count();
	System.out.println("list : "+words +"\ncount words more than 3 char : "+count);
	
	
	
	
	
	
	
	
	
	
}
}
