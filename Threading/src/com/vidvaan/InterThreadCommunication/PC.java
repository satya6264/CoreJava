package com.vidvaan.InterThreadCommunication;

import java.util.LinkedList;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class PC {
	LinkedList list = new LinkedList();
	int capacity = 2;
	public void produce() {
		int value = 0;
		while(true) {
			synchronized (this) 
			{while (list.size() == capacity)
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Producer produced :"+ value);
				list.add(value++);
				notify();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void consume() {
		while(true) {
			synchronized (this) {
				while(list.size()==0)
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				int val = (int) list.removeFirst();
				System.out.println("Consumer consumed :"+val);
				notify();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
