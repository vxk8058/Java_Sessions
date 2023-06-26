package com.ram;

public class thread{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println(Thread.activeCount()); // gets the number of active threads
		Thread.currentThread().setName("MAIN"); // sets the name of the thread
		System.out.println(Thread.currentThread().getName()); // gets name
		Thread.currentThread().setPriority(10); // sets priority (lowest=> 1 - 10 <=highest)
		System.out.println(Thread.currentThread().getPriority()); // gets priority (lowest=> 1 - 10 <=highest)
		System.out.println(Thread.currentThread().isAlive()); // checks if alive
		
		for (int i = 3; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // how many milliseconds we want the thread to sleep after each iteration
		}
		System.out.println("You're done!");
			
	}
}
