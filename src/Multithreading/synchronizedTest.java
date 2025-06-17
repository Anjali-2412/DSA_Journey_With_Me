package Multithreading;

public class synchronizedTest {
	public static void main(String[] args) {
		synchronizationConcept count = new synchronizationConcept();
		MyThread t1 = new MyThread(count);
		MyThread t2 = new MyThread(count);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(count.getCount());
	}
}
