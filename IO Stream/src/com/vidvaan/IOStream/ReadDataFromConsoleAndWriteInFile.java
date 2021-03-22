package com.vidvaan.IOStream;

import java.io.BufferedReader;

import java.io.FileWriter;
import java.io.IOException;

import java.io.InputStreamReader;

public class ReadDataFromConsoleAndWriteInFile {
	public static void main(String[] args) {
		System.out.println("enter data");
		try (InputStreamReader fis = new InputStreamReader(System.in);

				BufferedReader br = new BufferedReader(fis);
				FileWriter fw = new FileWriter("sat.txt", true);) {
			fw.write("\n"+br.readLine());
			// System.out.println(br.readLine());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed");
	}

}
