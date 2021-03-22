package com.vidvaan.conversions.chartoint;

public class IntToCharExample4 {

	public static void main(String[] args) {
		int redix = 10;
		int redix2 = 16;

		int i = 1;
		int a = 10;
		char c = Character.forDigit(i, redix);
		char c2 = Character.forDigit(a, redix2);

		System.out.println(c);
		System.out.println(c2);

	}
}
