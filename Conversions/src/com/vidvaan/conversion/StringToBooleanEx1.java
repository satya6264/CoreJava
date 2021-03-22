package com.vidvaan.conversion;

public class StringToBooleanEx1 {
	public static void main(String[] args) {
		String s1 = "true";
		String s2 = "TRUE";
		String s3 = "ok";
		boolean b1 = Boolean.parseBoolean(s1);
		boolean b2 = Boolean.parseBoolean(s2);
		boolean b3 = Boolean.parseBoolean(s3);
		boolean B1 = Boolean.valueOf(s1);
		boolean B2 = Boolean.valueOf(s2);
		boolean B3 = Boolean.valueOf(s3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("----------");
		System.out.println(B1);
		System.out.println(B2);
		System.out.println(B3);

	}

}
