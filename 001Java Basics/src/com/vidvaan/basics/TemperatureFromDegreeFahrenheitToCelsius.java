package com.vidvaan.basics;

public class TemperatureFromDegreeFahrenheitToCelsius {
	public static void main(String[] args) {
		int f = 205;
		double c = (f - 32) * 5 / 9;

		System.out.println("Celsius:" + c);
	}
}