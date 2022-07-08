package com.sujata.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class ThreadJob implements Runnable{

	private int counter;
	
	public ThreadJob(int counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" counter : "+counter);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" wake up for counter : "+counter);
		
	}
	
}
public class MyFirstDemo {

	public static void main(String[] args) {
		Executor threadPool=Executors.newFixedThreadPool(4);
		
		for(int counter=1;counter<=5;counter++) {
			threadPool.execute(new ThreadJob(counter));

		}
		

	}

}
