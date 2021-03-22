package com.vidvaan.oops.abstraction.Interface;

interface DefaultMethod {
void draw();

default void msg() {
	System.out.println("Default Method...");
}
}


class Rectangle implements DefaultMethod {

	@Override
	public void draw() {
		System.out.println("Drawing...");

	}

}



public class TestingDefault {
	public static void main(String[] args) {
		DefaultMethod d = new Rectangle();
		d.draw();
		d.msg();
	}

}

