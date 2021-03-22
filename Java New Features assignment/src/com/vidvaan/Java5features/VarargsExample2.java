package com.vidvaan.Java5features;

public class VarargsExample2 {
	public static void display(String... values) {
		System.out.println("dispay method invoked");
	}
	public static void main(String[] args) {
		display();
		display("my name is satya");
	}

}
