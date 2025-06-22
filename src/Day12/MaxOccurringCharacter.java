package Day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MaxOccurringCharacter {
	public static void main(String[] args) {
		String str = "programming";
		HashMap<Character,Integer> charCount = new HashMap<>();
		for(char ch : str.toCharArray()) {
			charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
			
		}
		//find the max frequency
		
		int maxCount =Collections.max(charCount.values());
		
		//print all character with Max frequcency
		System.out.print("Max occurring character(s): ");
		for(Entry<Character, Integer> entry : charCount.entrySet()) {
			if(entry.getValue() == maxCount) {
				System.out.print(entry.getKey()+"  ");
				
			}
			
		}
		System.out.println("\nFrequency : "+maxCount);
		
		
		
		
		
	}
	
}
