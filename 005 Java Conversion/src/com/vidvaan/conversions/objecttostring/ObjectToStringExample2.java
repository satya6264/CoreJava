package com.vidvaan.conversions.objecttostring;

public class ObjectToStringExample2 {

	public static void main(String[] args) {
		String s = "hello";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String rev = sb.toString();

		System.out.println(s);
		System.out.println(rev);
	}

}
