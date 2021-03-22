package com.vidvaan.regex;

import java.util.regex.Pattern;

public class RegexEx6 {

	public static void main(String[] args) {
		System.out.println("alphanumeric characters");
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "satya1"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abc123"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "a1b2c3"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abc"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abcxyz"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "123"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "123456"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abc@12"));

	}

}
