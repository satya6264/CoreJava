package com.vidvaan.Java5features;

public class VarargsExample4 {
	public static void display(int values, String... values2) {
		System.out.println("Number is " + values);
		for (String s : values2) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		display(200, "Satya");
		display(300, "I'm", "your", "Friend");
	}
}
