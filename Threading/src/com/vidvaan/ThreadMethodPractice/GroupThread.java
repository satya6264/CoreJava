package com.vidvaan.ThreadMethodPractice;

public class GroupThread implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <=  2; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		GroupThread gt = new GroupThread();
		ThreadGroup tg = new ThreadGroup("Satya group");
		Thread t1 = new Thread(tg, gt);
		t1.start();
		System.out.println("Thread group name : "+tg.getName());
		tg.list();
		//tg.suspend();
	}

}
