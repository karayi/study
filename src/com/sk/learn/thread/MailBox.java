package com.sk.learn.thread;

public class MailBox implements Runnable{

	@Override
	public void run() {
		System.out.println("Checking mail box!");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
