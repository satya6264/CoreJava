package com.vidvaan.oops.abstraction.abstractt;

public abstract class Veichle {

	public Veichle() {
		System.out.println("Veichle Created");
	}

	abstract void run();

	void gearChange() {
		System.out.println("Gear Changed");
	}

}

class Hero extends Veichle {

	@Override
	void run() {
		System.out.println("Veichle running");
	}

	public static void main(String[] args) {
		Veichle v = new Hero();
		v.run();
		v.gearChange();
	}
}
