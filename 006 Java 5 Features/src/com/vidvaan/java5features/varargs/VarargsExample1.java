package com.vidvaan.java5features.varargs;

public class VarargsExample1 {

	public void sum(double... num) {
		double sum = 0;

		for (double i : num) {
			sum = sum + i;
		}
		System.out.println("Sum : "+sum);
	}

	public static void main(String[] args) {
		VarargsExample1 v = new VarargsExample1();
		v.sum(12, 45, 43, 54, 45, 45.98);

	}
}
