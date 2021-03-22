package com.vidvaan.basicprograms;

public class ArthematicOperations {

	public int sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum of two numbers = " + sum);
		return sum;
	}
	
	public int sub(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println("Sub of two numbers = " + sub);
		return sub;
	}

	public int mul(int num1, int num2) {
		int mul = num1 * num2;
		System.out.println("Multiplication of two numbers = " + mul);
		return mul;
	}

	public double div(int num1, int num2) {
		double div = num1 / num2;
		System.out.println("Division = " + div);
		return div;
	}
	
	public double mod(int num1, int num2) {
		double mod =num1%num2;
		System.out.println("Mod of two numbers = "+mod);
		return mod;
	}

	public static void main(String[] args) {
		ArthematicOperations arthematic = new ArthematicOperations();
		arthematic.sum(12, 87);
		arthematic.sub(23, 12);
		arthematic.mul(30, 20);
		arthematic.div(7, 2);
		arthematic.mod(7, 2);
	}

}
