package com.vidvaan.StringMethods;

public class StringConcatExampleUsingSpacesAndSpecialChars {
	public static void main(String[] args) {
		String s1 = "Satya";
		String s2 = "Narayana";
		String s3 = "Guduru";
		String s4 = s1.concat(" ").concat(s2).concat(" ").concat(s3);

		System.out.println(s4);
		String s5 = s1.concat("!!!");
		System.out.println(s5);
		String s6 = s1.concat("@").concat(s3);
		System.out.println(s6);

	}

}
