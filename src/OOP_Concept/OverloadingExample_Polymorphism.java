package OOP_Concept;
class Calculator{
	int add(int a, int b) {
		return a+b;
		
	}
	int add(int a, int b,int c) {
		return a+b+c;
	}
}
public class OverloadingExample_Polymorphism {
public static void main(String[] args) {
	Calculator c = new Calculator();
	System.out.println(c.add(2, 2));
	System.out.println(c.add(0, 0, 1));
	
}
}
