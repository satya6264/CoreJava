package com.vidvaan.bytearraystream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEx1 {

	public static void main(String[] args) {

		byte[] buf = { 35, 36, 37, 38 };

		ByteArrayInputStream bis = new ByteArrayInputStream(buf);

		int k = 0;
		while ((k = bis.read()) != -1) {
			char ch = (char) k;

			System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);

		}
	}

}
