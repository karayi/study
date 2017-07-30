package com.sk.learn.thread;

public class TimerClass extends Thread{
	
	public void run(){
		for (int i = 0; i < 2; i++) {
			System.out.println(i+ "Hello I am timer ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
