package com.vidvaan.conversion;

public class BooleanToStringEx1 {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		String s1 = String.valueOf(b1);
		String s2 = String.valueOf(b2);
		String a1 = Boolean.toString(b1);
		String a2 = Boolean.toString(b2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("----------");
		System.out.println(a1);
		System.out.println(a2);
	}

}
