package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrquency {
	public static void main(String[] args) {
		String str = "Java is great and java is powerful";
		
		Map<String,Long> wordFreq = Arrays.stream(str.split("\\s+"))
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(
						word ->word,
						Collectors.counting()
						));
		
		System.out.println(wordFreq);
		
		

	
		 
		
	}
}
