package Multithreading.locks;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
	private final ReentrantLock lock = new ReentrantLock();
	
	public void outerMethod() {
		lock.lock();
		try {
			System.out.println("Outer method");
			innerMethod();
			
		}
		finally {
			lock.unlock();
		}
	}
	
	public void innerMethod() {
		lock.lock();
		try {
			System.out.println("Inner method");
		}
		finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		ReentrantExample exam = new ReentrantExample();
		exam.outerMethod();
	}
}
