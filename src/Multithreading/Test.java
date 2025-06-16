package Multithreading;

public class Test {

	public static void main(String[] args) {
		//====Thread start using extending thread class
		//CreationOfThread th = new CreationOfThread();
		//th.start();
		
		
		//====Thread starting using Runable interface
		
		CreatedThreadUsingRunableInterface crun = new CreatedThreadUsingRunableInterface();
		Thread t1 = new Thread(crun);
		t1.start();
		
		for(int i=0;i<100000;i++) {
			System.out.println(Thread.currentThread().getName());
		}

	}

}
