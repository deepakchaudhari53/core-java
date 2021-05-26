package com.mindscripts.threads;

public class ThreadTest implements Runnable {
	private Thread t;

	@Override
	public void run() {
		System.out.println("in test thread run");

	}

	public static void main(String[] args) {
		ThreadTest threadTest = new ThreadTest();
		Thread t = new Thread(threadTest, "someName");
		SecondThread threadTest1 = new SecondThread();
		Thread t2 = new Thread(threadTest1, "someName1");
		t.start();
		t2.start();
		try {
			t2.join();
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
