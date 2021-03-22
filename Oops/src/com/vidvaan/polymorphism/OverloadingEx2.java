package com.vidvaan.polymorphism;

public class OverloadingEx2 {
	public int sum(int a, int b) {
		System.out.println("int : " + (a + b));
		return a + b;
	}

	public double sum(int a, double b) {
		System.out.println("double : " + (a + b));
		return a + b;
	}

	public static void main(String[] args) {
		OverloadingEx2 ovr = new OverloadingEx2();

		ovr.sum(10, 20.5);
		ovr.sum(10, 35);
	}

}
