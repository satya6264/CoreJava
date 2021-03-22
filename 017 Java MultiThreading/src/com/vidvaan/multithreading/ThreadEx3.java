package com.vidvaan.multithreading;

public class ThreadEx3 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ThreadEx3 t1 = new ThreadEx3();
		ThreadEx3 t2 = new ThreadEx3();

		t1.start();
		t2.start();
		
	}

}
