package com.vidvaan.multithreading;

public class ThreadEx8 extends Thread {

	@Override
	public void run() {
		System.out.println("running thread name is : " + Thread.currentThread().getName());
		System.out.println("running thread priority is : " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		ThreadEx8 t1 = new ThreadEx8();
		ThreadEx8 t2 = new ThreadEx8();

		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);

		t1.start();
		t2.start();
	}

}
