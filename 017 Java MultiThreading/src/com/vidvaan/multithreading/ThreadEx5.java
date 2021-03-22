package com.vidvaan.multithreading;

public class ThreadEx5 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + i);
		}
	}

	public static void main(String[] args) {
		ThreadEx5 t1 = new ThreadEx5();
		ThreadEx5 t2 = new ThreadEx5();
		ThreadEx5 t3 = new ThreadEx5();

		t1.setName("Thread 1 ");
		t2.setName("Thread 2 ");
		t3.setName("Thread 3 ");

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;
		t2.start();
		t3.start();
	}

}
