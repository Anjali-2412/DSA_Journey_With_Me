package Day26;

import java.util.HashMap;

public class CountChars {
		public static void main(String[] args) {
			String s = "aabccc";
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for(char c : s.toCharArray()) {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
			System.out.println(map);
		}
}
