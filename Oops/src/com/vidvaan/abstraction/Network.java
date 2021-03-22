package com.vidvaan.abstraction;

public abstract class Network {
	public void isd() {
		System.out.println("isd calls");
	}
	public abstract void sms();
	public abstract void calls();
	public abstract void data();

}
