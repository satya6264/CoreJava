package com.vidvaan.sequenceInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamEx3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		FileInputStream fis3 = new FileInputStream("c.txt");
		Vector vector = new Vector();
		vector.add(fis1);
		vector.add(fis2);
		vector.add(fis3);

		Enumeration enumeration = vector.elements();

		SequenceInputStream sis = new SequenceInputStream(enumeration);

		int data;
		while ((data = sis.read()) != -1) {
			System.out.print((char) data);
		}

		sis.close();
		fis1.close();
		fis2.close();
		fis3.close();
	}

}
