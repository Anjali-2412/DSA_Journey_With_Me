package Exception;
//custom exception
class PasswordTooWeakException extends RuntimeException {
	public PasswordTooWeakException(String msg) {
		super(msg);
	}
}

class PasswordChecker{
	public void check(String password) {
		if(password.length()<6) {
			throw new PasswordTooWeakException("Password is too weak. user atleast 6 charcters");
			
		}
		System.out.println("Password accepted");
	}
}


public class TestMainPasswordTooWeakException {
	public static void main(String[] args) {
		PasswordChecker checker = new PasswordChecker();
		try {
			checker.check("123");
		}catch(PasswordTooWeakException e) {
			System.out.println("Caught : "+e.getMessage());
		}
	}
}
