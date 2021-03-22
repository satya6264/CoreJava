package com.vidvaan.oops.abstraction.abstractt;

public abstract class Shape {

	abstract void draw();

}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing Rectangle");
	}

}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}

	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
	}

}
