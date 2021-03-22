package com.vidvaan.DeadLock;

public class Thread2 extends Thread {
	private Resource1 resource1;
	private Resource2 resource2;
	public Thread2(Resource1 resource1, Resource2 resource2) {
		super();
		this.resource1 = resource1;
		this.resource2 = resource2;
	}
	
	@Override
	public void run() {
		System.out.println("Thread2 Started...");
		synchronized (resource2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread2 access Resource2 waiting for Resource1");
			synchronized (resource1) {
				System.out.println("Resource1 is also available Task completed");
				
			}
		}
		System.out.println("Thread2 Ended...");
	}

}
