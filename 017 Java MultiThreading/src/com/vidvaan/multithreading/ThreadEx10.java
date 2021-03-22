package com.vidvaan.multithreading;

public class ThreadEx10 extends Thread {
	@Override
	public void run() {
		System.out.println("Name: " + Thread.currentThread().getName());
		System.out.println("Daemon: " + Thread.currentThread().isDaemon());
	}

	public static void main(String[] args) {
		ThreadEx10 t1 = new ThreadEx10();
		ThreadEx10 t2 = new ThreadEx10();

		t1.start();
		t1.setDaemon(true);
		t2.start();
	}

}
