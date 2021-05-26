package com.mindscripts.threads;

public class SecondThread implements Runnable{


	public void run() {
		System.out.println("in run of runnable thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("second thread is done waiting");
	}
	
	public static void main(String[] args) {
		SecondThread secondThread = new SecondThread();
		Thread t = new Thread(secondThread);
		t.start();
	}

}
