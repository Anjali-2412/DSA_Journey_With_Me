package Multithreading;

public class MyThread extends Thread {
	private synchronizationConcept counter;
	public MyThread(synchronizationConcept counter) {
		this.counter = counter;
	}
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			counter.increment();
		}
	}
	
	
}
