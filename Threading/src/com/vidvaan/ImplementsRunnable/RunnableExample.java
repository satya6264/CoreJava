package com.vidvaan.ImplementsRunnable;
class Numbers implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 500; i++) {
			System.out.println(i);
//			try {
//				Thread.sleep(0);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
			//}
		}
		
	}
	
}
class Numbers2 implements Runnable{

	@Override
	public void run() {
		for (int i = 501; i <= 1000; i++) {
			System.out.println(i);
			
		}
		
	}
	
}

public class RunnableExample {
	public static void main(String[] args) {
		Numbers n = new Numbers();
		Numbers2 m = new Numbers2();
		Thread t1 = new Thread(n);
		Thread t2 = new Thread(m);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		t2.start();
				
	}

}
