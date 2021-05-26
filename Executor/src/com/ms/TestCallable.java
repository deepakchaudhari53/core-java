package com.ms;

import java.util.concurrent.Callable;

public class TestCallable implements Callable<Long> {
	long count;

	TestCallable(long count) {
		this.count = count;
	}

	@Override
	public Long call() throws Exception {
		long sum = 0;
		for (long i = 1; i < count; i++) {
			sum += i;
		}
		System.out.println("Sum is " + sum);
		return sum;
	}
}
