package Day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Valid_Parenthesis_UsingStack_Map {
	
	public static boolean isValid(String s ) {
		//Map for bracket pairs
		Map<Character,Character> bracketMap = new HashMap<>();
		bracketMap.put(')', '(');
		bracketMap.put('}', '{');
		bracketMap.put(']', '[');
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char ch : s.toCharArray()) {
			//If it's a closing bracket
			if(bracketMap.containsKey(ch)) {
				char top = stack.isEmpty() ? '#' : stack.pop();
				if(top != bracketMap.get(ch)) {
					return false;
				}
				
			}
			else {
				stack.push(ch);
			}
			
			
			
			
		}
		return stack.isEmpty();
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("([)]"));     // false
	}
}
