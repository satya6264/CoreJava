package com.vidvaan.IOStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffferReader {
	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("src/sathya");
			BufferedReader bf = new BufferedReader(fr);
			String line = bf.readLine();
			while (line != null) {
				System.out.println(line);
				line = bf.readLine();

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
