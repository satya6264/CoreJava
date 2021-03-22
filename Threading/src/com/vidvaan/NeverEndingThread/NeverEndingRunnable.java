package com.vidvaan.NeverEndingThread;

public class NeverEndingRunnable implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("Running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
