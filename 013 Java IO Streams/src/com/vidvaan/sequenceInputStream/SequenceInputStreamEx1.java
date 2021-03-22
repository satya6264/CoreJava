package com.vidvaan.sequenceInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamEx1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		int data;
		while ((data = sis.read()) != -1) {
			System.out.print((char) data);
		}
		sis.close();
		fis2.close();
		fis1.close();
	}

}
