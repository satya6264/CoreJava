package com.vidvaan.NeverEndingThread;

public class TestNeverEndingRunnable {
	public static void main(String[] args) {
		NeverEndingRunnable neverEndingRunnable = new NeverEndingRunnable();
		Thread t1 = new Thread(neverEndingRunnable);
		t1.start();
	}

}
