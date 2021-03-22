package com.vidvaan.IOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromFile {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/com/vidvaan/IOStream/a.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			System.out.println(bis.read());
			System.out.println("success");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
