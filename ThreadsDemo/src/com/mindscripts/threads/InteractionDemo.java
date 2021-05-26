package com.mindscripts.threads;

public class InteractionDemo {
	
	public static void main(String[] args) {
		WaitDemo waitDemo = new WaitDemo();
		Thread t = new Thread(waitDemo);
		
		t.start();
		
		
		synchronized (waitDemo) {
			try {
				waitDemo.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("inside main");
	}

}
