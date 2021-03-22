package com.vidvaan.basics;

public class CompoundInterest {
	public static void main(String[] args) {
		int p = 1200;
		int t = 2;
		double r = 5.4;
		double ci = (p * ((1 + r / 100) * (1 + r / 100)));
		System.out.println("Compound Interest=" + ci);
	}
}