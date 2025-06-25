package OOP_Concept;
abstract class Shape{
	abstract void draw();
	void commonMethod() {
		System.out.println("This is shape");
	}
}

class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing Circle");
		
	}
	
	
}
public class AbstractClass {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		s.commonMethod();
	}
}
