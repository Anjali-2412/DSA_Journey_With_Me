package Multithreading;

public class CreationOfThread extends Thread {

	@Override
	public void run() {
		for(int i=0;i<100000;i++) {
			System.out.println("World!");
		}
	}
	
}
