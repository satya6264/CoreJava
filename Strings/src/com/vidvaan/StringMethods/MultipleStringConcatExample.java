package com.vidvaan.StringMethods;

public class MultipleStringConcatExample {
	public static void main(String[] args) {
		String s1 = "Satya";
		String s2 = "Narayana";
		String s3 = " Guduru";
		String s4 = s1.concat(s2);
		System.out.println(s4);
		String s5 = s1.concat(s2).concat(s3);
		System.out.println(s5);
	}

}
