package Day09;

import java.util.HashMap;
import java.util.Map;

public class firstRepeatedCharUsingMap {
	public static void usingMap(String word) {
		word =word.toLowerCase();
		Map<Character,Integer> map = new HashMap<>();
		for(char ch : word.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>1) {
				System.out.println("First repeating character : "+entry.getKey());
				break;
			}
			
			
		} 
	}
	
	public static void main(String[] args) {
		String str = "Prgramming";
		usingMap(str);
	}
}
