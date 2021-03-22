package com.vidvaan.string;

public class ReplaceSpace {

	public static void main(String[] args) {
		String string = "Welcome to java string programs";

		char ch = '-';

		string = string.replace(' ', ch);

		System.out.println("String after replacing spaces with given character: ");

		System.out.println(string);
	}

}
