package com.sujata.waitandnotify;

public class QuestionJob implements Runnable {

	private Chat chat;
	
	public QuestionJob(Chat chat) {
		super();
		this.chat = chat;
	}

	@Override
	public void run() {
		String questions[]={"Hello","How are you?","Sounds Good!"};
		for(String question:questions) {
			chat.question(question);
		}

	}

}
