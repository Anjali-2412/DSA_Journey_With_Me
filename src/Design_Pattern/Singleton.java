package Design_Pattern;

public class Singleton {
	//A Singleton Class in Java is a design Pattern that ensures only one instance of the class is created and provide a global point of access to that instance.
	//Lazy Initialization (created when needed)
	private static Singleton instance ;
	private Singleton() {
		System.out.println("singleton instance has created");
	}
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	public static void main(String[] args) {
		Singleton s1 = getInstance();
		Singleton s2 = getInstance();
		System.out.println(s1==s2);
	}
}
