package com.vidvaan.NeverEndingThread;

public class NeverEndingThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("Never End...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
