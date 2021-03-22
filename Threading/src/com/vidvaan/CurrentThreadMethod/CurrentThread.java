package com.vidvaan.CurrentThreadMethod;

public class CurrentThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		     
    }    
    public static void main(String args[])  
    {    
        // creating two thread  
        CurrentThread t1=new CurrentThread();    
        CurrentThread t2=new CurrentThread();    
        // this will call the run() method  
        t1.start();    
        t2.start();    
    }    
	}


