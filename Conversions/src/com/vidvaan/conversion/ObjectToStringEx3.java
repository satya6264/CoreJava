package com.vidvaan.conversion;

public class ObjectToStringEx3 {
	public static void main(String[] args) {
		String s = "nitin";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String rev = sb.toString();
		if (s.equals(rev)) {
			System.out.println("Palindrome String");

		} else {
			System.out.println("Not Polindrome String");
		}

	}
}
