package OOP_Concept;
class Ani{
	void sound() {
		System.out.println("some sound");
	}
}
class Cat extends Ani{

	@Override
	void sound() {
		System.out.println("meow");
		
	}
	
}
public class Overrding_Polymorphism {
	public static void main(String[] args) {
		Ani a = new Cat();
		a.sound();
	}
}