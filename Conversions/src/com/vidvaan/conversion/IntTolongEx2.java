package com.vidvaan.conversion;

public class IntTolongEx2 {
	public static void main(String[] args) {
		int i = 300;
		Long l = new Long(i);
		Long l2 = Long.valueOf(i);
		System.out.println(l);
		System.out.println(l2);
	}

}
