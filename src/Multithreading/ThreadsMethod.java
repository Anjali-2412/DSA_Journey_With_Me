package Multithreading;

public class ThreadsMethod extends Thread {
		
	
	  public ThreadsMethod(String name) { super(name); }
	 
	
	@Override
	public void run() {
			
			while(true) {
				System.out.println("Hello world !");
			}
		
		
		//  for(int i=0;i<5;i++) {
		//  System.out.println(Thread.currentThread().getName()+ " is running");
		  //Thread.yield();
		  
		  //System.out.println(Thread.currentThread().getName()+ " - Priority: "+Thread.currentThread().getPriority()+ " - count :"+ i); }
		 
		
		/*
		 * try { Thread.sleep(5000); System.out.println("Thread is running ..."); }
		 * catch (InterruptedException e) {
		 * 
		 * e.printStackTrace();
		 * 
		 * 
		 * }		 */
		
	//	  }
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadsMethod t1 = new ThreadsMethod("first");
		ThreadsMethod t2 = new ThreadsMethod("second");
		t1.setDaemon(true);
		t1.start();
		System.out.println("Main done");
		
		t2.start();
		
		//t1.interrupt();
		//t1.join();
		
		//System.out.println("Hello");
		
		/*
		 * ThreadsMethod l = new ThreadsMethod("Low priority thread"); ThreadsMethod m =
		 * new ThreadsMethod("Medium Priority Thread"); ThreadsMethod h = new
		 * ThreadsMethod("High Priority Thread");
		 * 
		 * h.setPriority(MAX_PRIORITY); l.setPriority(MIN_PRIORITY);
		 * m.setPriority(NORM_PRIORITY);
		 * 
		 * l.start(); m.start(); h.start();
		 */		
		
		
		
		
		
	}
}
//Start || run || sleep || join || setPriority || interrupt || yield