package com.vidvaan.multithreading;

public class ThreadEx2 implements Runnable {

	@Override
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {
		ThreadEx2 t2 = new ThreadEx2();
		Thread t1 = new Thread(t2);
		t1.start();
	}
}
