package com.vidvaan.oops.polymorphism.methodoverriding;

public class Cal2 extends Calculator {

	@Override
	public void sum(int a, int b) {
		System.out.println(a * b);
		super.sum(a, b);
	}

	public static void main(String[] args) {
		Cal2 cal = new Cal2();
		cal.sum(10, 20);
	}

}
