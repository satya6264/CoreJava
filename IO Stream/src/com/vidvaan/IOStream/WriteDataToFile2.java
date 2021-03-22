package com.vidvaan.IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFile2 {
	public static void main(String[] args) {
		FileWriter fw = null;

		try {
			fw = new FileWriter("src\\com\\vidvaan\\IOStream\\a.txt");
			String name = "My name is Satya G";
			fw.write(name);
			System.out.println("Success");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
