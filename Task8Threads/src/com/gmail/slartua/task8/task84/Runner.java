package com.gmail.slartua.task8.task84;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;


public class Runner {
	private static int N = 1000_000_0;
	private static int[] array = Runner.getRandomArray(N);
	private static final int NUM_NUMBERS = 20;

	private static int[] getRandomArray(int length) {
		Random rn = new Random();
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(100);
		}
		return array;
	}

	static class RecSumOfArray extends RecursiveTask<Integer> {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		int from, to;

		public RecSumOfArray(int from, int to) {
			super();
			this.from = from;
			this.to = to;
		}

		@Override
		public Integer compute() {
			if ((to - from) <= NUM_NUMBERS) {
				int localSum = 0;
				for (int i = from; i <= to; i++) {
					localSum += array[i];
				}
				System.out.printf("\t Summing of range %d to %d is %d %n", from, to, localSum);
				return localSum;
			} else {
				int mid = (from + to) / 2;
				System.out.printf("\t Forking into two ranges: %d to %d and %d to %d %n", from, mid, mid, to);
				RecSumOfArray firstHalf = new RecSumOfArray(from, mid);
				firstHalf.fork();
				RecSumOfArray secondHalf = new RecSumOfArray(mid + 1, to);
				int resultSecond = secondHalf.compute();
				return firstHalf.join() + resultSecond;
			}
		}
	}

	public void run() {
		ForkJoinPool pool = new ForkJoinPool();
		long start = System.nanoTime();
		int computedSum = pool.invoke(new RecSumOfArray(0, N-1));
		long end = System.nanoTime();
		System.out.println(computedSum);
		System.out.println("/nTime = " + (end - start) / 1000000000.0);
		start = System.nanoTime();
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		end = System.nanoTime();
		System.out.println("/nTime = " + (end - start) / 1000000000.0);
		System.out.println(sum);
	}

}
