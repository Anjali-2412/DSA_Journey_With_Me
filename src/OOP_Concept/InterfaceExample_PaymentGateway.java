package OOP_Concept;
interface PaymentMode{
	void pay(double amount);
	void refund(double amount);
}

class CreditCardPayment implements PaymentMode{

	@Override
	public void pay(double amount) {
		System.out.println("Paid Rs. "+amount+" using credit card");
		
	}

	@Override
	public void refund(double amount) {
		System.out.println("Refund Rs. "+amount+ " to credit card");
		
	}
	
}

class Upi_Payment implements PaymentMode{

	@Override
	public void pay(double amount) {
		System.out.println("paid Rs. "+amount +" using UPI");
		
	}

	@Override
	public void refund(double amount) {
		System.out.println("Refunded Rs. "+amount+ "to UPI account");
		
	}
	
}

public class InterfaceExample_PaymentGateway {
	public static void main(String[] args) {
		PaymentMode payment1 = new CreditCardPayment();
		payment1.pay(1500);
		payment1.refund(200);
		
		System.out.println("----------------------------");
		
		PaymentMode payment2 = new Upi_Payment();
		payment2.pay(999);
		payment2.refund(99);
		}
}
