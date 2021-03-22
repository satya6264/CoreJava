package com.vidvaan.ImplementsRunnable;

public class Ground {
	public static void main(String[] args) {
		
		Walk walk = new Walk();
		Run run = new Run();
		Thread t1 = new Thread(walk);
		Thread t2 = new Thread(run);
		t1.start();
		t2.start();
	}

}
