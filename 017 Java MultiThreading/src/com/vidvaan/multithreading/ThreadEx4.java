package com.vidvaan.multithreading;

public class ThreadEx4 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ThreadEx4 t1 = new ThreadEx4();
		ThreadEx4 t2 = new ThreadEx4();
		System.out.println("Calling run method...");
		t1.run();
		t2.run();
		System.out.println("Calling start method...");

		t1.start();
		t2.start();
	}

}
