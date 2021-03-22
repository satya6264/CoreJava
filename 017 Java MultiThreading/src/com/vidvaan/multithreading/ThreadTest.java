package com.vidvaan.multithreading;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		try {
			threadA.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadA.start();

		ThreadB threadB = new ThreadB();
		Thread thread = new Thread(threadB);
		try {
			thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.start();
	}

}
