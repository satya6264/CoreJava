package com.vidvaan.multithreading;

public class ThreadEx9 extends Thread {
	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread working...");
		} else {
			System.out.println("User thread working...");
		}
	}

	public static void main(String[] args) {
		ThreadEx9 t1 = new ThreadEx9();
		ThreadEx9 t2 = new ThreadEx9();
		ThreadEx9 t3 = new ThreadEx9();
		t2.setDaemon(true);

		t1.start();
		t2.start();
		t3.start();
	}

}
