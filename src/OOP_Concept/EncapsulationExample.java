package OOP_Concept;
class Student{
	private String name;
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
}
public class EncapsulationExample {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("anjali");
		System.err.println(s.getName());
	}
}
