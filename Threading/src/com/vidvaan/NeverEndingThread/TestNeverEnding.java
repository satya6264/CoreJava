package com.vidvaan.NeverEndingThread;
class NeverEnding extends Thread{
	@Override
	public void run() {
		while (true) {
			System.out.println("U can't catch me...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
class ok extends Thread{
	@Override
	public void run() {
		while (true) {
			System.out.println("I'm comming...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
public class TestNeverEnding {
	public static void main(String[] args) {
		System.out.println("Lets Start");
		NeverEnding n = new NeverEnding();
		ok k = new ok();
		n.start();
		k.start();
	}

}
