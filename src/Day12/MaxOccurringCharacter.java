package Day12;

import java.util.HashMap;

public class MaxOccurringCharacter {
	public static void main(String[] args) {
		String str = "programming";
		HashMap<Character,Integer> charCount = new HashMap<>();
		for(char ch : str.toCharArray()) {
			charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
			
		}
		char maxChar = str.charAt(0);
		int maxCount =0;
		for(char c : charCount.keySet()) {
			if(charCount.get(c)>maxCount) {
				maxCount=charCount.get(c);
				maxChar=c;
			}
		}
		System.out.println(maxChar);
	}
	
}
