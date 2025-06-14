package String_Program;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
	public static void main(String[] args) {
		String str = "backend";
		Map<Character,Integer> freq = new HashMap<>();
		for(char ch : str.toCharArray()) {
			freq.put(ch, freq.getOrDefault(ch, 0)+1);
			
		}
		System.out.println(freq);
		
		
	}
}
