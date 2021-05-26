package com.mindscripts.threads;

public class FirstThread extends Thread {
	SynchronizationDemo d;

	public FirstThread(SynchronizationDemo d) {
		this.d = d;
	}

	public FirstThread() {
	}

	public void run() {
		d.printState();
		//d.doTest();
	/*	for(int i=0;i<=5;i++){
			System.out.println(i+" Thread Name:: "+Thread.currentThread().getName());
		}*/
	}

	public static void main(String[] args) {
		FirstThread firstThread = new FirstThread(new SynchronizationDemo());
		firstThread.setPriority(Thread.MAX_PRIORITY);
		firstThread.setName("First");
		firstThread.start();
		
		
		FirstThread secondThread = new FirstThread(new SynchronizationDemo());
		secondThread.setName("Second");
		secondThread.setPriority(Thread.MIN_PRIORITY);
		secondThread.start();
		//System.out.println("Thread Name:: "+Thread.currentThread().getName());
		
	}

}
