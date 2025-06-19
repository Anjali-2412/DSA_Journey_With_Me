package Day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static void main(String[] args) {
		//create the input list of words
		String[] words = {"eat","tea","tan","ate","nat","bat"};
		
		//Create a HashMap to group anagrams
		Map<String, List<String>> map = new HashMap<>();
		
		//Go through each words in the input
		for(String word :words) {
			
			//convert word to character array "eat"->['e','a','t']
			
			char[] chars = word.toCharArray();
			
			//sort the character array
			Arrays.sort(chars);
			
			//make sorted array back to String
			String sorted = new String(chars);
			
			map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
			
			
		}
		//print out all groups of anagrams
		for(List<String> group : map.values()) {
			System.out.println(group);
		}
	}
}
