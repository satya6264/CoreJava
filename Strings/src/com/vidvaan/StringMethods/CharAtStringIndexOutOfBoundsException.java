package com.vidvaan.StringMethods;

public class CharAtStringIndexOutOfBoundsException {
	public static void main(String[] args) {
		String s = "Satya Guduru";
		char ch = s.charAt(13);
		System.out.println(ch);
		System.out.println(s.charAt(-1));
	}

}
