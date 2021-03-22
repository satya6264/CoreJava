package com.vidvaan.IOStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	public static void main(String[] args) {

		System.out.println("Enter Numbers :");

		SatyaScanner sScanner = new SatyaScanner();
		int num1 = sScanner.nextInt();
		int num2 = sScanner.nextInt();
		System.out.println("Sum : " + (num1 + num2));

		try (InputStreamReader isr = null) {

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
