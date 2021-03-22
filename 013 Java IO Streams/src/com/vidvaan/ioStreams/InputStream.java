package com.vidvaan.ioStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) throws IOException {
		File file = new File("src/com/vidvaan/ioStreams/output");
		FileInputStream fis = new FileInputStream(file);
		int data;
		while ((data = fis.read()) != -1) {
			System.out.print((char) data);

		}
	}
}
