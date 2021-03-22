package com.vidvaan.JoinThreadMethod;

public class DaemonThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("DaemonThread");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
