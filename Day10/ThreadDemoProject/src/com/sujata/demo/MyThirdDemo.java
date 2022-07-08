package com.sujata.demo;
/*
 * class Thread implements Runnable{
 * public void run(){
 * 
 * }
 */
class InputValue{
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}

class Factorial extends InputValue implements Runnable{

	private int factorial;
	public Factorial(int number) {
		super();
		setNumber(number);
	}
	
	public void displayFactorial() {
		factorial=1;
		int num=getNumber();
		while(num>=1) {
			factorial=factorial*num;
			System.out.println(Thread.currentThread().getName()+" value : "+factorial);
			num--;
		}
		System.out.println(Thread.currentThread().getName()+"Final Factorial : "+factorial);
	}

	@Override
	public void run() {
		displayFactorial();
		
	}
	
}
public class MyThirdDemo {

	public static void main(String[] args) {
		Factorial factorialJob1=new Factorial(5);
//		Thread thread1=new Thread(factorialJob1);
		Thread thread1=new Thread(factorialJob1, "Factorial of 5 Thread");
		Factorial factorialJob2=new Factorial(3);
		Thread thread2=new Thread(factorialJob2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("Good Bye from "+Thread.currentThread().getName());
		
	}

}
