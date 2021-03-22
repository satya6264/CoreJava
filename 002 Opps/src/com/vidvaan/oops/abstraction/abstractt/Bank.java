package com.vidvaan.oops.abstraction.abstractt;

public abstract class Bank {

	abstract int getRateOfInterest();

}

class SBI extends Bank {

	@Override
	int getRateOfInterest() {
//		System.out.println("Rate of interest is 7%");
		return 7;
	}

}

class Andhra extends Bank {

	@Override
	int getRateOfInterest() {
//		System.out.println("Rate of interest is 9%");
		return 9;
	}

	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		System.out.println("Rate of interest is "+b.getRateOfInterest()+" %");
//		b.getRateOfInterest();
		b = new Andhra();
		System.out.println("Rate of interest is "+b.getRateOfInterest()+" %");
//		b.getRateOfInterest();
	}

}