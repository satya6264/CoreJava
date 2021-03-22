package com.vidvaan.JoinThreadMethod;

public class ThreadDemo extends Thread{
	public ThreadDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThreadDemo(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}

	public ThreadDemo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
		    System.out.println(Thread.currentThread().getName()+" "+i);
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
