package com.vidvaan.java5features.assertion;

import java.util.Scanner;

public class AssertionExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value age");
		
		int value = scanner.nextInt();
		assert value>=18:"Not valid";
		
		System.out.println("Value is : "+value);
	}
}
