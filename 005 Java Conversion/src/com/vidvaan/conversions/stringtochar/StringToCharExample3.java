package com.vidvaan.conversions.stringtochar;

public class StringToCharExample3 {

	public static void main(String[] args) {
		String s = "Hello";
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			System.out.println("Chat at " + i + " index is : " + ch[i]);

		}
	}

}
