package Exception;


//custom exception
class InvalidPhoneNumberException extends RuntimeException{
	
	public InvalidPhoneNumberException(String msg) {
		super(msg);
	}
}

//class uses it
class PhoneValidator{
	public static void validator(String phoneNumber) {
		if(phoneNumber.length()<10) {
			throw new InvalidPhoneNumberException("Enter valid phone number");
		}
		System.out.println("Valid Phone Number");
	}
}




public class TestMainInvlalidPhoneNumberException {
	public static void main(String[] args) {
		PhoneValidator ph = new PhoneValidator();
		try {
			ph.validator("12345678910");
			ph.validator("1234");
		}catch (InvalidPhoneNumberException e) {
			System.out.println("Caught : "+e.getMessage());
		}
		
	}
}
