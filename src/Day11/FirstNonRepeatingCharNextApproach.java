package Day11;

public class FirstNonRepeatingCharNextApproach {
	public static void main(String[] args) {
		String str ="anjali"; //that approach only when inputs in lower case 
		int[] freq = new int[26];
		
		for(char ch: str.toCharArray()) {
			freq[ch -'a']++;
		}
		
		for(char ch :str.toCharArray()) {
			if(freq[ch - 'a']==1) {
				System.out.println("First non-repeating character : "+ch);
				return;
			}
		}
		System.out.println("No non- repeating character found");
	}
}
//Time complexity : o(n)
//space complexity : o(1) becoz array size is fixed