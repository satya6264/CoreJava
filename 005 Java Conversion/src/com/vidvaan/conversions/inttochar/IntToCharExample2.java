package com.vidvaan.conversions.inttochar;

public class IntToCharExample2 {

	public static void main(String[] args) {
		int i = 1;
		char c = (char) i;
		char c2 = (char) (i+'0');
		System.out.println(c);
		System.out.println(c2);
	}
}
