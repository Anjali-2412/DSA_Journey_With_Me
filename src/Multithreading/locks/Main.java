package Multithreading.locks;

public class Main {
	public static void main(String[] args) {
		BankAccount  bankAccount = new BankAccount();
		Runnable sbi = new Runnable() {
			
			@Override
			public void run() {
				bankAccount.withdraw(50);
				
			}
		};
		
		Thread t1 = new Thread(sbi,"Thread-1");
		Thread t2 = new Thread(sbi,"Thread-2");
		t1.start();
		t2.start();
	}
}
