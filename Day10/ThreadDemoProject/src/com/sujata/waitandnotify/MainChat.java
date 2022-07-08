package com.sujata.waitandnotify;

public class MainChat {

	public static void main(String[] args) {
		Chat chat=new Chat();
		
		Thread atul=new Thread(new QuestionJob(chat), "Atul");
		Thread adarsh=new Thread(new AnswerJob(chat),"Adarsh");
		
		atul.start();
		adarsh.start();

	}

}
