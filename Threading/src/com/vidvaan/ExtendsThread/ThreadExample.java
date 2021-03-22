package com.vidvaan.ExtendsThread;
class Hello extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
class Hi extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Hi...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
public class ThreadExample extends Thread {
	public static void main(String[] args) {
		Hello h = new Hello();
		Hi n = new Hi();
		h.start();
		n.start();
	}
	
}