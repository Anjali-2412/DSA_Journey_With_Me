package Exception;

//Custom Exception
class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}

//class uses it
class BankAccount{
	public void withdraw(double balance, double amount) {
		if(amount > balance) {
			throw new InsufficientBalanceException("Not enough balance to withdraw.");
		}
		System.out.println("Withdraw successful : "+amount);
	}
}

public class TestMainInsufficientBalanceException {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		try {
			acc.withdraw(500, 1000);
		}catch (InsufficientBalanceException e) {
			System.out.println("Caught : "+e.getMessage());
		}
	}
}
