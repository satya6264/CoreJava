package com.vidvaan.defaultmethods;

abstract class AbstractClass {

	public AbstractClass() {
		super();
		System.out.println("You can creat constructor in abstract class");
	}

	abstract int add(int a, int b);

	int sub(int a, int b) {
		return a - b;
	}

	static int mul(int a, int b) {
		return a * b;
	}
}

public class AbstractTest extends AbstractClass {

	@Override
	int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		AbstractTest at = new AbstractTest();
		int add = at.add(20, 10);
		int sub = at.sub(20, 10);
		int mul = AbstractClass.mul(20, 10);
		System.out.println("Addition = " + add);
		System.out.println("Substraction = " + sub);
		System.out.println("Multiplication = " + mul);
	}
}
