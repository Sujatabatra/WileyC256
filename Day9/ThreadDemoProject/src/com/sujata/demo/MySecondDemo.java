package com.sujata.demo;

class MySecondThread extends Thread {
	
	public MySecondThread() {
		super();
	}
	
	public MySecondThread(String name) {
		super(name);
	}
	// run method is the job of the thread
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}

public class MySecondDemo {

	public static void main(String[] args) {
		//new born state
		MySecondThread thread1=new MySecondThread();
		MySecondThread thread2=new MySecondThread("SecondThread");
//		thread2.setName("SecondThread");
		MySecondThread thread3=new MySecondThread();
		MySecondThread thread4=new MySecondThread();
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread3.setPriority(Thread.NORM_PRIORITY);
		thread4.setPriority(Thread.MAX_PRIORITY);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" parent i : "+i);
		}
		System.out.println("Good Bye from parent "+Thread.currentThread().getName());
		
		
	}

}
