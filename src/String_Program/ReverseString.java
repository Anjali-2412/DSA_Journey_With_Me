package String_Program;

public class ReverseString {
	public static void main(String[] args) {
		String input = "backend";
		String reversed = new StringBuilder(input).reverse().toString();
		System.out.println(reversed);
	}
}
