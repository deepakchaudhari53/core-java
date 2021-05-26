package com.mindscripts.threads;

public class WaitDemo implements Runnable{

	@Override
	public void run() {
		synchronized (this) {
			int total=0;
			for(int i=0;i<10;i++){
				 total= total +i;
				 System.out.println(" the total is: "+total);
			}
			notify();
		}
		
		
	}

}
