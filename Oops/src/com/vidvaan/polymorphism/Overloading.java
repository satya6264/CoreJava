package com.vidvaan.polymorphism;

public class Overloading {
	public int sum(int a, int b) {
		System.out.println("sum :" + (a + b));
		return a + b;
	}

	public double sum(int a, double b, int c) {
		System.out.println("double : " + (a + b + c));
		return a + b + c;
	}

	public static void main(String[] args) {
		Overloading ovr = new Overloading();
		// System.out.println(10.5 + 20 + 30);
		ovr.sum(10, 20);
	}

}
