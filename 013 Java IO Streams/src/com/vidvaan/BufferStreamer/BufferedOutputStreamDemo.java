package com.vidvaan.BufferStreamer;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("buffer.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String text = "Welocome to vidvaan";
		byte data[] = text.getBytes();
		bos.write(data);
		bos.flush();
		bos.close();
		fos.close();
		System.out.println("Buffered Output Stream Success");
	}

}
