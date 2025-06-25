package OOP_Concept;
abstract class Payment{
	String payeeName;
	Payment(String payeeName){
		this.payeeName=payeeName;
	}
	
	//abstract method must be implemented by child class
	abstract void makePayment(double amount) ;
		
	//non-abstract(concrete) method
	void printReceipt(double amount) {
		System.out.println("Payment of Rs. "+amount+" made by "+payeeName);
		
	}
	
}
class CreditCardPaymeny extends Payment{

	CreditCardPaymeny(String payeeName) {
		super(payeeName);
		
	}

	@Override
	void makePayment(double amount) {
		System.out.println("processing credit card payment of Rs. "+amount);
		printReceipt(amount);
		
	}
	
	
	
}

class UpiPayment extends Payment{

	UpiPayment(String payeeName) {
		super(payeeName);
		
	}

	@Override
	void makePayment(double amount) {
		System.out.println("Processing UPI payment of Rs. "+amount);
		printReceipt(amount);
		
	}
	
}
public class AbstractionExample {		
	public static void main(String[] args) {
		Payment p1 = new CreditCardPaymeny("Anjali");
		p1.makePayment(1500.00);
		
		System.out.println("------------------------------");
		
		Payment p2 = new UpiPayment("Rahul");
		p1.makePayment(800.00);

	}

}
