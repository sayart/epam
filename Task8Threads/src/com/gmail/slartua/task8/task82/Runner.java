package com.gmail.slartua.task8.task82;

public class Runner {
	public static Integer value = 0;
	public static boolean flag = false;
	public final int COUNT = 10;

	public void run() {
		Thread counter = new Thread(() -> {
			synchronized (this) {
				for (int i = 0; i < COUNT; i++) {
					while (flag) {
						try {		
							wait();
						} catch (InterruptedException e) {
							System.out.println(e);
						}
					}
					value++;
					flag = true;
					notify();

				}
			}
		});
		counter.start();

		Thread printer = new Thread(() -> {
			synchronized (this) {
				for (int i = 0; i < COUNT; i++) {
					while (!flag) {
						try {
							wait();
						} catch (InterruptedException e) {
							System.out.println(e);
						}
					}
					System.out.println(value + " ");
					flag = false;
					notify();
				}
			}
		});
		printer.start();

	}

}
