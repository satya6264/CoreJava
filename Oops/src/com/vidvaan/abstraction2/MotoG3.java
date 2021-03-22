package com.vidvaan.abstraction2;

public class MotoG3 implements Mobiles, Phones {
	public void cost() {
		Phones.super.cost();
	}

	public void company() {
		System.out.println("COMPANY : Moto");
	}

	public void model() {
		System.out.println("MODEL   : Moto G3");
	}

	public void display() {
		System.out.println("DISPLAY : 5 inches");
	}

	public void ram() {
		System.out.println("RAM     : 2 GB");
	}

	public void memoery() {
		System.out.println("MEMORY  : 16 GB");
	}

	public void battery() {
		System.out.println("BATTERY : 2700 mAh");
	}

}
