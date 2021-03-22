package com.vidvaan.Java5features;

public class VarargsExample3 {
	static void display(String... values) {
		System.out.println("Display method invoked");
		for (String s : values) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		display();
		display("Hello my Friends");
		display("Hello", "my", "Friends");
	}
}
