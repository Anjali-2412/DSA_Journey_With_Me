package Day19;

import java.util.Stack;

public class Easy_way_ValidParanthesis {
	
		public static boolean isValid(String str) {
			Stack<Character> st = new Stack<Character>();
			
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				
				//If opening bracket , push to stack
				if(ch == '(' || ch == '{' || ch == '[') {
					st.push(ch);
				}
				
				else {
					//If closing bracket but stack is empty
					if(st.isEmpty()) {
						return false;
					}
					//check for matching pair
					char top = st.peek();
					if( (top == '(' && ch == ')') || 
						(top == '{' && ch == '}') ||
						(top == '[' && ch == ']')){
							st.pop();
						}
						else {
							return false;
						}
					
					
				}
			}
			
			return st.size() ==0;
			
		
		}

		public static void main(String[] args) {
		System.out.println(isValid("({[]})"));
		System.out.println("{[]");
		System.out.println("[]}");
	}
	}

