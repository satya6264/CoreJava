package com.vidvaan.conversions.inttodouble;

public class IntToDoubleExample2 {

	public static void main(String[] args) {
		int i = 100;
		Double d = new Double(i);
		Double d2 = Double.valueOf(i);

		System.out.println(d);
		System.out.println(d2);
	}

}
