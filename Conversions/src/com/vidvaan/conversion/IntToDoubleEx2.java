package com.vidvaan.conversion;

public class IntToDoubleEx2 {
	public static void main(String[] args) {
		int i = 200;
		Double d = new Double(i);
		Double d2 = Double.valueOf(i);
		System.out.println(d);
		System.out.println(d2);
	}

}
