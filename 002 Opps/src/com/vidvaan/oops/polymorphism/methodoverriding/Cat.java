package com.vidvaan.oops.polymorphism.methodoverriding;

public class Cat extends Dog {

	@Override
	public void run() {
		System.out.println("Cat is running...");
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.run();
	}

}
