package com.sujata.anonymous;

public class AnotherExample {

	public static void main(String[] args) {
		Thread thread1=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" is running!");
				
			}
		}, "FirstThread");
		
		thread1.start();
		
		System.out.println("Good Bye from "+Thread.currentThread().getName());

	}

}
