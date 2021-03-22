package com.vidvaan.string;

public class removeWhiteSpace {
	public static void main(String[] args) {

		String str = "Remove white spaces";
		
		System.out.println("String before removing all the white spaces : " + str);

		str = str.replaceAll("\\s+", "");

		System.out.println("String after removing all the white spaces : " + str);
	}

}
