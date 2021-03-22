package com.vidvaan.regex;

import java.util.regex.Pattern;

public class RegexEx4 {
	
	public static void main(String[] args) {
		
		System.out.println("? Quantifier");
		System.out.println(Pattern.matches("[amn]?", "a"));
		System.out.println(Pattern.matches("[amn]?", "aaa"));
		System.out.println(Pattern.matches("[amn]?", "aammmnnn"));
		System.out.println(Pattern.matches("[amn]?", "aazzzzttaa"));
		System.out.println(Pattern.matches("[amn]?", "am"));
		System.out.println("------------------");
		
		System.out.println("+ Quantifier");
		System.out.println(Pattern.matches("[amn]+", "a"));
		System.out.println(Pattern.matches("[amn]+", "aaa"));
		System.out.println(Pattern.matches("[amn]+", "aaaammmmmnnn"));
		System.out.println(Pattern.matches("[amn]+", "aazzta"));
		System.out.println("------------------");

		
		System.out.println("* Quantifier");
		System.out.println(Pattern.matches("[amn]*", ""));
		System.out.println(Pattern.matches("[amn]*", "a"));
		System.out.println(Pattern.matches("[amn]*", "aaa"));
		System.out.println(Pattern.matches("[amn]*", "amn"));
		System.out.println(Pattern.matches("[amn]*", "ammmmnnna"));
		System.out.println(Pattern.matches("[amn]*", "amzn"));
		System.out.println("------------------");
		
		System.out.println("X{n} Quantifier");
		System.out.println(Pattern.matches("[amn]{2}", "aa"));
		
	}

}
