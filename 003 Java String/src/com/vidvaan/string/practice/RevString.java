package com.vidvaan.string.practice;

public class RevString {

	public static String reverseString(String str) {
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;

	}

	public static void main(String[] args) {

		String s = "Satya";
		System.out.println(s.length());

		String rev = reverseString(s);
		System.out.println(rev);

	}

}
