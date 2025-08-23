package Preparation_Interview_Assesment;

public class CamelCasValidator {
	public static String isvalid(String s) {
		if(s.matches("[A-Z][a-zA-Z]*")) {
			return s;
		}
		return Character.toUpperCase(s.charAt(0))+s.substring(1);
	}
		
		
	
	public static void main(String[] args) {
		String s ="aLiCe";
		
		
		System.out.println(isvalid("aLiCe"));
		System.out.println(isvalid("Alice"));

		System.out.println(isvalid("ALICE"));
		System.out.println(isvalid("bob"));
		System.out.println(isvalid("alice"));

		
		
		
		
		
	}
}
