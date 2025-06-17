package Day09;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharUsingStream {
	public static void usingStream(String word) {
		Set<Character> set = new HashSet<>();
		Character repChar = word.toLowerCase().chars().mapToObj(c ->
		{
			char ch = (char)c;
			return ch;
		})
				.filter(c-> !set.add(c))
				.findFirst()
				.orElse(null);
		System.out.println("first repeating char : "+repChar);
	}
}
