package com.vidvaan.conversion;

public class IntToCharEx5 {
	public static void main(String args[]) {
		int REDIX = 16;// redix 16 is for Hexadecimal value
		int a = 10;
		char c = Character.forDigit(a, REDIX);
		System.out.println(c);
	}

}
