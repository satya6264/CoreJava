package com.vidvaan.polymorphism;

public class Child2 extends Child {
	public void m1() {
		System.out.println("i am Raju");
	}

	public static void main(String[] args) {
		Child2 Child2 = new Child2();
		Child2.m1();
		Overriding Child = new Child2();
		Child.m1();
		Overriding Overriding = new Child2();
		Overriding.m1();

	}

}
