package Day18;

public class StringTransformer {
	public static void main(String[] args) {
		String input ="tomorrow";
		StringBuilder output = new StringBuilder();
		for(char c : input.toCharArray()) {
			if(c=='o') {
				output.append('3');
			}
			else if(c == 'r') {
				output.append('r');
			}
			else {
				output.append(c);
			}
		}
		System.out.println(output);
	}
}
