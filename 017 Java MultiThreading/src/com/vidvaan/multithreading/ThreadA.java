package com.vidvaan.multithreading;

public class ThreadA extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
//			if(i==10) {
//				try {
//					ThreadA.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
			System.out.println("Thread A "+i);
		}
	}

}
