package com.vidvaan.JoinThreadMethod;

public class MainThreadDemo {
public static void main(String[] args) {
		
	    DaemonThread daemonThread = new DaemonThread();
	    daemonThread.setDaemon(true);
	    daemonThread.start();
		
		for (int i = 1; i <= 5; i++) {
		    System.out.println(Thread.currentThread().getName()+" "+i);
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
