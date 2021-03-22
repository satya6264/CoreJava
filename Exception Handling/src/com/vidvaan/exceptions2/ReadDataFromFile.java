package com.vidvaan.exceptions2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromFile {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src\\com\\vidvaan\\exceptions2\\b.txt");
			int i = 0;
			try {
				while ((i = fis.read()) != -1) {
					System.out.print((char) i);
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			System.out.println("Success");
//			System.out.println("End");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("End");
		
		
	}

}
