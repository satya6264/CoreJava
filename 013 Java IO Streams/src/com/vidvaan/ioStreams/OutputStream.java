package com.vidvaan.ioStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
	
	public static void main(String[] args) throws IOException {
		
		String text = "welcome to vidvaan institute";
		File file = new File("src/com/vidvaan/ioStreams/output");
		FileOutputStream fos = new FileOutputStream(file);
		byte data[]=text.getBytes();
		fos.write(data);
		System.out.println("Success");
		fos.close();
	}

}
