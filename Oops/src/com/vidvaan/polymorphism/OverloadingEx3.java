package com.vidvaan.polymorphism;

public class OverloadingEx3 {
	public int sub(int a, int b) {
		System.out.println("Sub : " + (a - b));
		return a - b;
	}

	public double sub(int a, double b, int c) {
		System.out.println("Sub : " + (a - b - c));
		return a - b - c;
	}

	public static void main(String[] args) {
		OverloadingEx3 over = new OverloadingEx3();
		over.sub(20, 15);
		over.sub(50, 10.5, 5);
	}

}
