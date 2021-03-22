package com.vidvaan.oops.polymorphism.methodoverriding;

public class Dog extends Animal {

	public void run() {
		System.out.println("Dog is running...");

	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.run();
	}

}
