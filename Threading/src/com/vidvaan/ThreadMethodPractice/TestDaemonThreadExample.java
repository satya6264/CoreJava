package com.vidvaan.ThreadMethodPractice;

public class TestDaemonThreadExample {
	public static void main(String[] args) {
		DaemonThreadExample de = new DaemonThreadExample();
		de.setDaemon(true);
		de.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
