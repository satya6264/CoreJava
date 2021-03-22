package com.vidvaan.regex;

import java.util.regex.Pattern;

public class RegexEx5 {

	public static void main(String[] args) {
		System.out.println("metacharacters d...."); // \\d means digit
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d", "11"));
		System.out.println(Pattern.matches("[\\d]+", "11"));
		System.out.println(Pattern.matches("\\d", "1a"));
		System.out.println("-------------------");

		System.out.println("metacharacters D...."); // \\D means non-digit
		System.out.println(Pattern.matches("\\D", "aaa"));
		System.out.println(Pattern.matches("\\D", "a"));
		System.out.println(Pattern.matches("[\\D]+", "aaa"));
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("\\D", "a111"));
		System.out.println(Pattern.matches("[\\D]*", "amn"));
		System.out.println("-------------------");

	}
}