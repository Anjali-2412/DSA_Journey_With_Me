package Day17;

public class PallindromString {
	public static boolean checkPallindromString(String input) {
		int left=0;
		int right = input.length()-1;
		while(left<right) {
			if(input.charAt(left)!=input.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		
		
		return true;
	}
	
	public static void main(String[] args) {
		String input = "madam";
		if(checkPallindromString(input)) {
			System.out.println("pallindrom String");
		}
		else {
			System.out.println("not pallindrom String");
		}
	}
}
//time complexity : o(n)
//space complexity : o(1)