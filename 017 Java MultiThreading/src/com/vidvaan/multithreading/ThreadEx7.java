package com.vidvaan.multithreading;

public class ThreadEx7 extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args) {
		
		ThreadEx7 t1 = new ThreadEx7();
		ThreadEx7 t2 = new ThreadEx7();
		
		t1.start();
		t2.start();
	}

}
