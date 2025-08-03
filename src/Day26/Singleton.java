package Day26;
class Singleton1{
	private static  Singleton1 instance;
	private Singleton1() {
		System.out.println("instance has created");
	}
	public static Singleton1 getInstance() {
		if(instance == null) {
			instance =new Singleton1();
		}
		return instance;
	}
}
public class Singleton {
	public static void main(String[] args) {
		Singleton1 obj = Singleton1.getInstance();
		Singleton1 obj1 = Singleton1.getInstance();
		System.out.println(obj1.equals(obj));
		
	}
	
}
