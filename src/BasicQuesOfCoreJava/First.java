package BasicQuesOfCoreJava;

public class First {
	public static void main(String[] args) {
		int a =50;
		int b=50;
		Integer c = 50;
		Integer d = 50;
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(c.hashCode()+" "+d.hashCode());
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		//if someone asked that output using == operator and equals method , we can ans perfectly by doing above practical .
	}
}
