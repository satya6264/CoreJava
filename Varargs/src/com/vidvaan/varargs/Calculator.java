package com.vidvaan.varargs;

public class Calculator {
	public static void display(int... values) {
		int sum = 0;
		for (int i : values) {
			sum = sum + i;
			System.out.println(i);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		display(2, 4, 7, 8);
	}
}
