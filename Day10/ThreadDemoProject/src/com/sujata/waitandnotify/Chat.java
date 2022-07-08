package com.sujata.waitandnotify;

public class Chat {
	
	private boolean flag=true;
	
	synchronized void question(String question) {
		if(flag==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" asked "+question);
		flag=false;
		notify();
	}
	
	synchronized void answer(String answer) {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" replied "+answer);
		flag=true;
		notify();
	}
}
