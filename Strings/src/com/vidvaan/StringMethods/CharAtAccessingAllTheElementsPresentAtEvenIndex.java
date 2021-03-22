package com.vidvaan.StringMethods;

public class CharAtAccessingAllTheElementsPresentAtEvenIndex {
	public static void main(String[] args) {
		String s = "Welcome to find element present at even index";
		for (int i = 0; i < s.length(); i++) {
			if(i%2<=0) {
				System.out.println("CharAt "+i+" = Place :"+s.charAt(i));
			}
			
		}
		
	}

}
