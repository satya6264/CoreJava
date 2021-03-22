package com.vidvaan.conversions.stringtochar;

public class StringToCharExample2 {

	public static void main(String[] args) {
		String s = "Hello";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println("Char at " + i + " index is : " + c);

		}
	}

}
