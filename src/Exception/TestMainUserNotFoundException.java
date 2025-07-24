package Exception;

//Custom Exception
class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(String msg) {
		super(msg);
	}
}


//Class that uses it
class UserService{
	public void findUser(String username) {
		if(!"admin".equals(username)) {
			throw new UserNotFoundException("User ' "+username+" ' not found.");
			
		}
		System.out.println("User found : "+username);
	}
}


//Main method
public class TestMainUserNotFoundException {
	public static void main(String[] args) {
		UserService userService = new UserService();
		try{
			userService.findUser("guest");
		}catch(UserNotFoundException e) {
			System.out.println("Caught : "+e.getMessage());
		}
	}
}
