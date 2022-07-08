package com.sujata.waitandnotify;

public class AnswerJob implements Runnable {

	private Chat chat;
	
	public AnswerJob(Chat chat) {
		super();
		this.chat = chat;
	}

	@Override
	public void run() {
		String answers[]={"Hi","I am Fine!","Thanks!"};
		for(String answer:answers) {
			chat.answer(answer);
		}

	}

}
