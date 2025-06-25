package OOP_Concept;
interface Flyable{
	void fly();
	
}
class Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("Bird is flying");
		
	}
	
}
public class InterfaceConcept {
	public static void main(String[] args) {
		Flyable b = new Bird();
		b.fly();
	}
}
//Interface used to achieve the multiple interface