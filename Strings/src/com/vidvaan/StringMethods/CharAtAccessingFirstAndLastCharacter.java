package com.vidvaan.StringMethods;

public class CharAtAccessingFirstAndLastCharacter {
	public static void main(String[] args) {
		String s = "Satyanarayana Guduru";
		String a = "Welcome to my World";
		char fc = s.charAt(0);
		char lc = s.charAt(s.length() - 1);
		System.out.println("Character at 0 index is: " + fc);
		System.out.println("Character at last index is: " + lc);
		System.out.println("Character at 0 index is: " + a.charAt(0));
		System.out.println("Character at last index is: " + a.charAt(a.length() - 1));

	}

}
