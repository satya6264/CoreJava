package com.vidvaan.oops.polymorphism.methodoverloading;

public class Calculator {

	public void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum : " + sum + "first");
	}

	public void sum(int num1, double num2) {
		double sum = num1 + num2;
		System.out.println("Sum : " + sum + "second");
	}

	public void sum(double num1, int num2) {
		double sum = num1 + num2;
		System.out.println("Sum : " + sum + "third");
	}

	public void sum(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println("Sum : " + sum + "fourth");
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.sum(2, 2);
	}

}
