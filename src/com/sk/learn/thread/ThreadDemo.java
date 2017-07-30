package com.sk.learn.thread;

public class ThreadDemo {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			Thread timerClass = new TimerClass();
			Runnable mailBox = new MailBox();
		
			timerClass.start();
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			new Thread(mailBox).start();
		}
		
		}
		

}
