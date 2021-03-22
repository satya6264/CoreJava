package com.vidvaan.basics;

public class DiameterCircumferenceAndAreaOfCircle {
	public static void main(String[] args) {

		int r = 10;
		double pi = 3.14;

		int d = 2 * r;
		double c = 2 * pi * r;
		double a = pi * r * r;
		System.out.println("Diameter:" + d);
		System.out.println("Circumference:" + c);
		System.out.println("Area:" + a);
	}
}
