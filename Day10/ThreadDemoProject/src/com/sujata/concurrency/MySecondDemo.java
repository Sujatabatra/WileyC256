package com.sujata.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ReturnableThreadJob implements Callable<String>{

	private int counter;
	
	public ReturnableThreadJob(int counter) {
		super();
		this.counter = counter;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(2000);
		return Thread.currentThread().getName()+" counter : "+counter;
	}
	
}
public class MySecondDemo {

	public static void main(String[] args) {
		ExecutorService threadPool=Executors.newFixedThreadPool(3);
		
		Future<String> future=threadPool.submit(new ReturnableThreadJob(999));

		System.out.println("Hello everyone how are you?");
		System.out.println("I am statement afterb future");
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
