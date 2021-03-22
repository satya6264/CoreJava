package com.vidvaan.StringMethods;

public class CharAtCountingFrequencyOfACharacterInTheString {
	public static void main(String[] args) {
		String s = "Satyanarayana";
		int count = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("Frequency of a is: " + count);
	}
}
