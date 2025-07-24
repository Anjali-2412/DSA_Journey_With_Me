package Exception;
//custom exception
class InvalidInputExceptionCheck extends RuntimeException{
	public InvalidInputExceptionCheck(String msg) {
		super(msg);
	}
}

//class uses it
class Calculator{
	public void divide(int a, int b) {
		if(b==0) {
			throw new InvalidInputExceptionCheck("can not divide by zero.");
			
		}
		System.out.println("Result : "+(a/b));
	}
}


public class TestMainInvalidInputException {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			calc.divide(10, 0);
		}catch (InvalidInputExceptionCheck e) {
			System.out.println("Caught : "+e.getMessage());
		}
	}
}
