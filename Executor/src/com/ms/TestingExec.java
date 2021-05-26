package com.ms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingExec {
	private static final int NTHREDS = 10;

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
		// at no point of time will there be more than 10 threads.
		// All threads created in the beginning - irrespective of whether they
		// are required or not

		// Other options:::
		// Executors.newCachedThreadPool - threads will be created on need basis
		// and reused if available

		// Executors.newScheduledThreadPool - to execute things periodically or
		// after a delay
		
		// Executors.newSingleThreadExecutor - will create just ONE thread.
		// Executors.newSingleThreadScheduledExecutor - just ONE thread with scheduling facility
		
		for (int i = 0; i < 500; i++) {
			Runnable worker = new TestRunnable(10000000L + i);
			executor.execute(worker);
		}
		// This will make the executor accept no new threads
		// and finish all existing threads in the queue
		executor.shutdown();
		// Wait until all threads are finish
		executor.awaitTermination(10000, TimeUnit.MILLISECONDS);
		System.out.println("Finished all threads");
	}
}
