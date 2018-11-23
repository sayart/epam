package com.gmail.slartua.task8.task81;

public class Runner implements Runnable{
	@Override
	public void run() {
		new Thread( () -> { 
			for (int i = 10; i > 0; i--) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Boom");
		}).start();
	}
}
