package com.vidvaan.ThreadMethodPractice;

public class ThreadPriority extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Priority of thread is : "+Thread.currentThread().getPriority());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			
			
		}
	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
	
	
		
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(MIN_PRIORITY);
		t1.start();
		t2.start();	
		t3.start();
	}

}
