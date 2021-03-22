package com.vidvaan.polymorphism;

public class Child extends Overriding {
	public void m1() {
		System.out.println("I am Naresh");
	}
	public static void main(String[] args) {
		Child Chaild = new Child();
		Chaild.m1();
		Overriding Overriding = new Overriding();
		Overriding.m1();
		Overriding Overriding2 = new Child();
		Overriding2.m1();
		
	}

}
