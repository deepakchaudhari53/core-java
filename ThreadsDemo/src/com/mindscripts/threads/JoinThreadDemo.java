package com.mindscripts.threads;

public class JoinThreadDemo {
	public static void main(String[] args) {
		SecondThread secondThread = new SecondThread();
		Thread t = new Thread(secondThread);
		t.start();
		
		try {
			t.join();
			//Thread.sleep(8000);
			//System.out.println("Now Main has finished waiting");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("at the end of main");
		
		
	}

}
