package BasicQuesOfCoreJava;

public class OveloadingMainMethod {
	 public static void main(String... args) {
	        System.out.println("Main with String[] args");
	        main(42);
	    }
	 
	    public static void main(int number) {
	        System.out.println( number);
	    }
	 
	    public static void main(String arg) {
	        System.out.println( arg);
	    }
}
