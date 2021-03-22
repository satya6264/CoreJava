package com.vidvaan.abstraction;

public class TestBikes {
	public static void main(String[] args) {
		Bikes Apache = new Apache();
		System.out.println("Apache AKULA Specifications");
		Apache.name();
		Apache.cost();
		Apache.cc();
		Apache.speed();
		System.out.println("----------");
		Bikes Glamour = new Glamour();
		System.out.println("Glamour Specifications");
		Glamour.name();
		Glamour.cost();
		Glamour.cc();
		Glamour.speed();
	}

}
