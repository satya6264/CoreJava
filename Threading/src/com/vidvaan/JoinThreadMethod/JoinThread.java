package com.vidvaan.JoinThreadMethod;

public class JoinThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 4; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread());
		}
	}

	public static void main(String args[]) {
		JoinThread t1 = new JoinThread();
		JoinThread t2 = new JoinThread();
		JoinThread t3 = new JoinThread();
		
		t1.start();

		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
	}
}
