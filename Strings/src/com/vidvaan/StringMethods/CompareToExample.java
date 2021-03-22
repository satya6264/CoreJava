package com.vidvaan.StringMethods;

public class CompareToExample {
	public static void main(String[] args) {
		String s1 = "Satya";
		String s2 = "Satya";
		String s3 = "Venkat";
		String s4 = "SatYa";
		String s5 = "Pranay";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
	}

}
