package com.vidvaan.StringMethods;

public class CharAtAccessingAllTheElementsPresentAtOddIndex {
	public static void main(String[] args) {
		String s = "Welcome to find elements present at odd index";
		for (int i = 0; i <= s.length() - 1; i++) {
			if (i % 2 != 0) {
				System.out.println("CharAt " + i + " = Place :" + s.charAt(i));
			}

		}

	}

}
