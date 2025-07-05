package Lambda_Expression;
@FunctionalInterface
interface Message{
	void sayHello();
}

@FunctionalInterface
interface Add{
	int sum(int a , int b);
}






public class TestLambda {
	public static void main(String[] args) {
		Message msg = ()->System.out.println("Hello from Lambda!");
		msg.sayHello();
		
		Add add = (a,b)->a+b;
		System.out.println("sum = "+add.sum(5, 4));
		
		
		
		
	}
}
