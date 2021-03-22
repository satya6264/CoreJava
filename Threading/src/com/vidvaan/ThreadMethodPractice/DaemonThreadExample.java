package com.vidvaan.ThreadMethodPractice;

public class DaemonThreadExample extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("DaemonThreadExample");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
