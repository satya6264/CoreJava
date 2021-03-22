package com.vidvaan.conversions.objecttostring;

class Emp {

}

public class ObjectToStringExample1 {

	public static void main(String[] args) {
		Emp e = new Emp();
		String s = e.toString();
		String s2 = String.valueOf(e);

		System.out.println(s);
		System.out.println(s2);
	}

}
