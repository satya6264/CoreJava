package com.vidvaan.multithreading;

public class ThreadEx6 extends Thread {
	@Override
	public void run() {
		System.out.println("running...");
	}

	public static void main(String[] args) {

		ThreadEx6 t1 = new ThreadEx6();
		ThreadEx6 t2 = new ThreadEx6();
		ThreadEx6 t3 = new ThreadEx6();
		System.out.println("t1 name : " + t1.getName());
		System.out.println("t2 name : " + t2.getName());
		System.out.println("t2 id : " + t2.getId());

		t1.start();
		t2.start();
		
		t1.setName("Thread one");
		System.out.println("After changing t1 name : "+t1.getName());
	}

}
