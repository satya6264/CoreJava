package com.vidvaan.multithreading;

public class ThreadEx extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 50; i++) {
			try {
				ThreadEx.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		ThreadEx t1 = new ThreadEx();
		ThreadEx t2 = new ThreadEx();
		t1.setName("thread1");
		t2.setName("thread 2");
//		t1.setDaemon(true);
//		t2.setDaemon(true);
		t1.start();
		t2.start();
		System.out.println("hi");
	}

}
