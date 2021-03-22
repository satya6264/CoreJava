package com.vidvaan.assignment;

public class Circle {
	public static double findArea(double r) {
		return Math.PI * r * r;
	}

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("Area : " + circle.findArea(2.3));

		System.out.println("Area :" + circle.findArea(3.23));
	}

}
