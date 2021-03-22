package com.vidvaan.conversions.chartoint;

public class CharToIntExample3 {

	public static void main(String[] args) {
		char c = '1';
		char c2 = '2';
		int i = Integer.parseInt(String.valueOf(c));
		int i2 = Integer.parseInt(Character.toString(c2));

		System.out.println(i);
		System.out.println(i2);
	}

}
