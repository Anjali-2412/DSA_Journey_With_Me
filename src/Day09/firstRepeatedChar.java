package Day09;

import java.util.HashSet;

public class firstRepeatedChar {
  //Write a program to find the first repeated character in a string
  // Write a program to find the first repeated character in a string form last

	public static void main(String[] args) {
		String word = "Programming";
		char result = findFirstRepeatedChar(word);
		if(result != 0) {
			System.out.println("First repeated character from start : "+result);
		}
		else {
			System.out.println("no repeated character found");
		}
		
	}
	public static char findFirstRepeatedChar(String str) {
		HashSet<Character> seen = new HashSet<>();
		for(char ch : str.toCharArray()) {
			if(seen.contains(ch)) {
				return ch;
			}
			else {
				seen.add(ch);
			}
		}
		
		
		return 0;//no repeated character
	}
	










}
