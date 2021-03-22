package com.vidvaan.conversions.stringtoboolean;

public class StringTOBooleanExample2 {

	public static void main(String[] args) {
		String s1 = "true";
		String s2 = "True";
		String s3 = "ok";

		boolean b1 = Boolean.valueOf(s1);
		boolean b2 = Boolean.valueOf(s2);
		boolean b3 = Boolean.valueOf(s3);

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
