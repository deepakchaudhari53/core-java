package com.ms;

public class TestRunnable implements Runnable {
	long count;

	TestRunnable(long count) {
		this.count = count;
	}

	@Override
	public void run() {
		long sum = 0;
		for (long i = 1; i < count; i++) {
			sum += i;
		}
		System.out.println("Sum is " + sum);
	}
}
