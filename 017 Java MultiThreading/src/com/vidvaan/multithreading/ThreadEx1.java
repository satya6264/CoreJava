package com.vidvaan.multithreading;

public class ThreadEx1 extends Thread {

	@Override
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {

		ThreadEx1 t1 = new ThreadEx1();
		t1.start();

	}

}
