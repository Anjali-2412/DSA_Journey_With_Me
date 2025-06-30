package Design_Pattern;
//Eager Initialization singleton
class EagerSingleton{
	private static final EagerSingleton instance = new EagerSingleton();
	private EagerSingleton() {}
	public static EagerSingleton getInstance() {
			return instance;
		}
	
}
//2- Lazy Initialization Singleon

class LazySingleton{
	private static LazySingleton instance;
	private LazySingleton() {}
	public static LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
			
		}
		return instance;
	}
}

//Thread safe Singleton

class ThreadSafeSingleton{
	private static volatile ThreadSafeSingleton instance;
	private ThreadSafeSingleton() {}
	public static ThreadSafeSingleton getInstance() {
		if(instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if(instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;	}
	
}

//Enum Singleton

enum EnumSingleton{
	INSTANCE;
	public void doSomething() {
		System.out.println("Doing something ....");
	}
}


public class MySigleton {
	public static void main(String[] args) {
		EagerSingleton eager = EagerSingleton.getInstance();
		EagerSingleton eager1 = EagerSingleton.getInstance();
		System.out.println(eager == eager1);
		
		LazySingleton lazy = LazySingleton.getInstance();
		LazySingleton lazy1 = LazySingleton.getInstance();
		System.out.println(lazy==lazy1);
		
		ThreadSafeSingleton threadSafe = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton threadSafe1 = ThreadSafeSingleton.getInstance();
		System.out.println(threadSafe==threadSafe1);
		
		EnumSingleton.INSTANCE.doSomething();
	}
}
