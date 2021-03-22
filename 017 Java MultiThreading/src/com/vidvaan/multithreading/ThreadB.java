package com.vidvaan.multithreading;

public class ThreadB implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread B "+i);
		}

	}

}
