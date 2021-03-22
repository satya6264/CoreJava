package com.vidvaan.oops.polymorphism.methodoverriding;

public class Calculator {

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.sum(10, 20);
	}

}
