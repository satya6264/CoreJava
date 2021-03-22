package com.vidvaan.ExceptionsUsingThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionThrows {
	public void m1() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("x.txt");
		System.out.println("m1");
	}

	public void m2() throws FileNotFoundException {
		m1();
		System.out.println("m2");
	}

	public void m3() throws FileNotFoundException {
		m2();
		System.out.println("m3");
	}

	public void m4() throws FileNotFoundException {
		m3();
		System.out.println("m4");
	}

	public static void main(String[] args) {
		ExceptionThrows et = new ExceptionThrows();
		try {
			et.m4();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
