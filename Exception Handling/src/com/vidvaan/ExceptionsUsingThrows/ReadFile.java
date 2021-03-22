package com.vidvaan.ExceptionsUsingThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFile {
	static void test() {
		try {
			System.out.println(10 / 2);
		} catch (ArithmeticException e) {
			throw new MyTestException("num div / 0",e);
		}
	}

	public static void readDataFromFile(String fileName) {
		try {
			FileInputStream fis = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			
			throw new MyFileNotFoundException("fileName", e);
		}
	}

	public static void main(String[] args) {
		test();
		readDataFromFile("fileName");
	}

}
