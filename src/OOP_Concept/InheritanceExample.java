package OOP_Concept;
class Animal{
	void eat(){
		System.out.println("animal is eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog is barking");
	}
}
public class InheritanceExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat(); // 
		d.bark();
	}
}
//One class inherits the properties and methods of another class using extends.
//* code reusability
//Maintainable hierarchy
