package Multithreading;

public class ThreadLifeCycle extends Thread{
	/*
	 * Thread LifeCycles 
	 * 1 - New 
	 * 2 - Runnable 
	 * 3 - Running 
	 * 4 - Blocked/Waiting 
	 * 5 - Termainated
	 */
  
	@Override
	public void run() {
		System.out.println("RUNNING");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadLifeCycle th = new ThreadLifeCycle();
		System.out.println(th.getState());  //Output - NEW
		
		
		th.start();
		System.out.println(th.getState());  //Output - RUNNABLE
	
		Thread.sleep(100);
		System.out.println(th.getState());
		
		th.join();
		System.out.println(th.getState());
	
	}

	
  
  
  
  
}
