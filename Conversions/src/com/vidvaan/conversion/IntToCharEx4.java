package com.vidvaan.conversion;

public class IntToCharEx4 {
	public static void main(String args[]) {
		int REDIX = 10;// redix 10 is for decimal number, for hexa use redix 16
		int a = 1;
		char c = Character.forDigit(a, REDIX);
		System.out.println(c);
	}

}
