package Multithreading;

public class synchronizationConcept {
	private int count =0;
	public synchronized void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}
}
