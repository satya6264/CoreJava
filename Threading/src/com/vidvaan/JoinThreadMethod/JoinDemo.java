package com.vidvaan.JoinThreadMethod;

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {

		ThreadGroup tg = new ThreadGroup("Satya Thread Group");

		ThreadDemo t1 = new ThreadDemo(tg, "T1");
		ThreadDemo t2 = new ThreadDemo(tg, "T2");
		ThreadDemo t3 = new ThreadDemo(tg, "T3");
		t1.setPriority(10);
		t1.start();
		t1.join(1000);
		t2.start();
		t2.join();
		t3.start();

		tg.list();
	}

}
