package com.vidvaan.InterThreadCommunication;

public class TestPC {
	public static void main(String[] args) {
		PC pc = new PC();
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				pc.produce();
				
			}
		};
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				pc.consume();				
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(r2);
		t2.start();
//		Thread t1 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				pc.produce();
//				
//			}
//		});
//		Thread t2 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				pc.consume();
//				
//			}
//		});
//		t1.start();
//		t2.start();
	}

}
