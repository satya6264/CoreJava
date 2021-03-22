package com.vidvaan.DeadLock;

public class Thread1 extends Thread {
	private Resource1 resource1;
	private Resource2 resource2;
	public Thread1(Resource1 resource1, Resource2 resource2) {
		super();
		this.resource1 = resource1;
		this.resource2 = resource2;
	}
	
	@Override
	public void run() {
		System.out.println("Thread1 Started....");
		synchronized (resource1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(" Thread1 access Resource1 waiting for Resource2");
			synchronized (resource2) {
				System.out.println("Resource2 is also available Task is completed ");
			}
			
		}
		System.out.println("Thread1 Ended...");
	}

}
