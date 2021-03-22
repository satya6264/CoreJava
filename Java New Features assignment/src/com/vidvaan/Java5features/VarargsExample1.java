package com.vidvaan.Java5features;

public class VarargsExample1 {
	public static void name(int values, String... values2) {
		System.out.println(values);

		for (String i : values2) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		name(2, "my", "name", "is", "satya");
	}

}
