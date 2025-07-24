package Exception;
//create custom Exception class
public class InvalidInputException extends RuntimeException {
		
	//constructor with message
	public InvalidInputException(String msg) {
		super(msg);
	}
	
	//constructor with message and cause
	public InvalidInputException(String msg,Throwable cause) {
		super(msg,cause);
	}
}
