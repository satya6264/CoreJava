package com.vidvaan.regex;

import java.util.regex.Pattern;

public class RegexEx7 {

	public static void main(String[] args) {
		System.out.println("by character classes and quantifiers ...");
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7703709359"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "9848012345"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "98480123456"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "1234567890"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "7123456789"));
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "9876543210"));
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "98765432100"));

	}

}
