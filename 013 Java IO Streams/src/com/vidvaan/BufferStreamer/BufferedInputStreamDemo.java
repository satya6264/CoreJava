package com.vidvaan.BufferStreamer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("buffer.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int data;
		try {
			while ((data = bis.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
