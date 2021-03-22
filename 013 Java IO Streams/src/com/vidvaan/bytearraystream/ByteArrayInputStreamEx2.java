package com.vidvaan.bytearraystream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEx2 {

	public static void main(String[] args) {

		byte[] buf = { 83, 65, 84, 89, 65 };

		ByteArrayInputStream bis = new ByteArrayInputStream(buf);

		int k = 0;
		while ((k = bis.read()) != -1) {
			char ch = (char) k;

			System.out.print(ch);

		}
	}

}
