package com.vidvaan.encapsulation.assignment;

public class Circle {
	double radius;
	String coulor;

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getCoulor() {
		return coulor;
	}

	public void setCoulor(String coulor) {
		this.coulor = coulor;
	}

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();

		c1.setRadius(2.0);
		c1.setCoulor("Blue");

		c2.setRadius(3.0);
		c2.setCoulor("Red");

		c3.setRadius(1.0);
		c3.setCoulor("Red");

		System.out.println("Circle 1");
		System.out.println("Radius :" + c1.getRadius());
		System.out.println("Colour : " + c1.getCoulor());
		System.out.println("Area : " + c1.getArea());
		System.out.println("----------");
		System.out.println("Circle 2");
		System.out.println("Radius :" + c2.getRadius());
		System.out.println("Colour : " + c2.getCoulor());
		System.out.println("Area : " + c2.getArea());
		System.out.println("----------");
		System.out.println("Circle 3");
		System.out.println("Radius :" + c3.getRadius());
		System.out.println("Colour : " + c3.getCoulor());
		System.out.println("Area : " + c3.getArea());
	}

}
