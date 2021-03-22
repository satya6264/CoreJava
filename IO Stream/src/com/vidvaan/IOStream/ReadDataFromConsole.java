package com.vidvaan.IOStream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadDataFromConsole {
	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Your Data: ");
	

		try {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
