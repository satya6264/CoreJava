package com.vidvaan.oops.abstraction.abstractt;

abstract class Bike {
	abstract void run();

}

class Honda extends Bike {

	@Override
	void run() {
		System.out.println("Running safely");
	}

	public static void main(String[] args) {
		Bike bike = new Honda();
		bike.run();
	}

}
