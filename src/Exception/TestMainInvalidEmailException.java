package Exception;
//custom exception
class InvalidEmailException extends RuntimeException
{
	public InvalidEmailException(String msg) {
		super(msg);
	}
}

//class use it
class EMailValidator{
	public void validate(String email) {
		if(!email.contains("@")) {
			throw new InvalidEmailException("Invalid email format.");
		}
		System.out.println("Email is valid");
	}
	
}

public class TestMainInvalidEmailException {
	public static void main(String[] args) {
		EMailValidator validator =new EMailValidator();
		try {
			validator.validate("testemail.com");
		}catch(InvalidEmailException e) {
			System.out.println("Caught : "+e.getMessage());
		}
	}
}
