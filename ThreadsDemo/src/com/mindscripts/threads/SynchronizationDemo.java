package com.mindscripts.threads;

public class SynchronizationDemo {
	
	public synchronized void doTest(){
		System.out.println("Start synchronized method"+Thread.currentThread().getName());
		for(int i=0;i<10;i++){
			System.out.println("Inside for"+Thread.currentThread().getName());
		}
		System.out.println("End synchronized method");
	}
	
	public static void main(String[] args) {
		SynchronizationDemo sd = new SynchronizationDemo();
		SynchronizationDemo sd1 = new SynchronizationDemo();
		FirstThread firstThread = new FirstThread(sd);
		FirstThread secondThread = new FirstThread(sd);
		firstThread.start();
		secondThread.start();
	}

	public synchronized void printState() {
		for(int i=0;i<5;i++){
			System.out.println("in printState - running thread: "+Thread.currentThread().getName());
		}
	}

}
