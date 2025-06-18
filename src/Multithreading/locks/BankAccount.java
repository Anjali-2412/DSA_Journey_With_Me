package Multithreading.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	private int balance =100;
	//using synchronize let suppose t1 is stuck somewhere and t2 is waiting to free the t1 
	//for this we are learning lock and where we manually stop it
	//Lock is interface and methods are lock(),unclock(),tryLock().
	//
	
	private final ReentrantLock lock = new ReentrantLock(); //no once can change it
	
	public synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+amount);
		/*
		 * if(lock.tryLock()) { // immedaite check krega t1 free h ya nhi , if not then t2 will not
		 * wait like above synchrozed case
		 * 
		 * 
		 * }
		 */
		
		try {
			if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) { //inna tym wait krega to take the lock
				if(balance >= amount) 
				{
					
					try {
					System.out.println(Thread.currentThread().getName()+" proceedting with withdrawl");
					Thread.sleep(10000);
					balance = balance-amount;
					System.out.println(Thread.currentThread().getName()+" completed withdraw. Remaining balance :"+ balance); 
					}
					catch(Exception e) {
						Thread.currentThread().interrupt();
					}
					finally {
						lock.unlock();
					}
					
				}
					
					
				else {
				
					System.out.println(Thread.currentThread().getName()+" insufficient balance");
				}
			}
			else {
				
				System.out.println(Thread.currentThread().getName()+" could not acquire the lock, will try later");
				
			}
			
			
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * if(balance >=amount) { System.out.println(Thread.currentThread().getName()
		 * +" proceedting with withdrawl"); try { Thread.sleep(10000); //3 seconds Pause
		 * } catch (InterruptedException e) {
		 * 
		 * } balance = balance-amount; //-=
		 * System.out.println(Thread.currentThread().getName()+
		 * " completed withdraw. Remaining balance :"+ balance); }else {
		 * System.out.println(Thread.currentThread().getName()+" insufficient balance");
		 * }
		 */
		
	}
}
