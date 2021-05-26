package com.ms;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class TestingCallables {
	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		simpleCallable();
		testCallableWithExecutors();
	}

	private static void simpleCallable() throws InterruptedException,
			ExecutionException {
		TestCallable testCalllable = new TestCallable(100000);
		FutureTask<Long> task = new FutureTask<Long>(testCalllable);
		Thread t = new Thread(task);
		t.start();
		System.out.println(task.get());
	}

	private static void testCallableWithExecutors()
			throws InterruptedException, ExecutionException {
		// Get ExecutorService from Executors utility class, thread pool size is
		// 10
		ExecutorService executor = Executors.newFixedThreadPool(10);
		// create a list to hold the Future object associated with Callable
		List<Future<Long>> list = new ArrayList<Future<Long>>();
		Callable<Long> callable = new TestCallable(100000);
		for (int i = 0; i < 100; i++) {
			// submit Callable tasks to be executed by thread pool
			Future<Long> future = executor.submit(callable);
			// add Future to the list, we can get return value using Future
			list.add(future);
		}

		for (Future<Long> fut : list) {
			System.out.println(fut.get());
		}
		// shut down the executor service now
		executor.shutdown();

	}
}
