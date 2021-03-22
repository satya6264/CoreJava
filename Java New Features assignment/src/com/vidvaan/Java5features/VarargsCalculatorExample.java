package com.vidvaan.Java5features;

public class VarargsCalculatorExample {
	public static void display(int... values) {
		int sum = 0;
		for (int i : values) {
			sum = sum + i;
			// System.out.println(i);

		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		display(2, 3, 4, 5, 4, 54, 64, 75);

	}
}
