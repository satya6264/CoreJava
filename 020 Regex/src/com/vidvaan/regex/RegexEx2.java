package com.vidvaan.regex;

import java.util.regex.Pattern;

public class RegexEx2 {
	public static void main(String[] args) {
		System.out.println(Pattern.matches(".s", "as"));
		System.out.println(Pattern.matches("s.", "sa"));
		System.out.println(Pattern.matches(".s", "sa"));
		System.out.println(Pattern.matches("s.", "as"));
		System.out.println(Pattern.matches("..s", "abs"));
	}

}
