package com.vidvaan.bytearraystream;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamEx1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos1 = new FileOutputStream("bytearray1.txt");
		FileOutputStream fos2 = new FileOutputStream("bytearray2.txt");

		ByteArrayOutputStream bos = new ByteArrayOutputStream();

//		String data = "Welcome to java";
//		int a = Integer.parseInt(data);

		int data = 65;
		bos.write(data);
		bos.writeTo(fos1);
		bos.writeTo(fos2);

		bos.flush();
		bos.close();
		System.out.println("Success");
	}

}
