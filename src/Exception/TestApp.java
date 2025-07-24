package Exception;

public class TestApp {
	
	public static void validateAge(int age) {
		if(age<18) {
			throw new InvalidInputException("Age must be 18 or above.");
		}
		else {
			System.out.println("Valid age : "+age);
		}
	}
	
	public static void main(String[] args) {
		validateAge(21);
		validateAge(12);
		
	}
	
}
