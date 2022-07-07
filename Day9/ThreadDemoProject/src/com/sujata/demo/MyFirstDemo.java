package com.sujata.demo;

class MyFirstThread extends Thread {
	// run method is the job of the thread
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}

public class MyFirstDemo {

	public static void main(String[] args) {
		//new born state
		MyFirstThread thread1=new MyFirstThread();
		MyFirstThread thread2=new MyFirstThread();
		
		
		thread1.start();
		thread2.start();
		
		thread1.run();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		thread1.start();   //will throw IllegalThreadStateException
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" parent i : "+i);
		}
		System.out.println("Good Bye from parent "+Thread.currentThread().getName());
		
		
	}

}
