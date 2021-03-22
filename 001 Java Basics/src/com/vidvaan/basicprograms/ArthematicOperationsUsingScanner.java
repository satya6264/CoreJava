package com.vidvaan.basicprograms;

import java.util.Scanner;

public class ArthematicOperationsUsingScanner {

	public int sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		int num1, num2;
		int sum = ((num1 = sc.nextInt()) + (num2 = sc.nextInt()));
		System.out.println("Sum of two numbers = " + sum);
		return sum;
	}

	public int sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		int num1, num2;
		int sub = ((num1 = sc.nextInt()) - (num2 = sc.nextInt()));
		System.out.println("Substraction of two numbers = " + sub);
		return sub;
	}

	public int mul() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		int num1, num2;
		int mul = ((num1 = sc.nextInt()) * (num2 = sc.nextInt()));
		System.out.println("Multiplication of two numbers = " + mul);
		return mul;

	}

	public int div() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		int num1, num2;
		int div = ((num1 = sc.nextInt()) / (num2 = sc.nextInt()));
		System.out.println("Division of two numbers = " + div);
		return div;
	}

	public int mod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		int num1, num2;
		int mod = ((num1 = sc.nextInt()) % (num2 = sc.nextInt()));
		System.out.println("Division of two numbers = " + mod);
		return mod;

	}

	public static void main(String[] args) {
		ArthematicOperationsUsingScanner arth = new ArthematicOperationsUsingScanner();
		arth.sum();
		arth.sub();
		arth.mul();
		arth.div();
		arth.mod();
	}

}
