package com.vidvaan.exceptions;

public class NumberFormatException {
	public static void main(String[] args) {
		//String s = "Satya";
		int num = Integer.parseInt("Satya");
		try {
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("Number Format Exception");
		}
	}

}
