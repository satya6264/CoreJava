package com.vidvaan.exceptions2;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataToFile {
	
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("src\\com\\vidvaan\\exceptions2\\a.txt");
		    String data = "My name is Satya";
		    byte[] arr = data.getBytes();
		    fos.write(arr);
		    System.out.println("Success");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
		} 
		catch (IOException e) {
			//System.out.println(e);
			//e.printStackTrace();
		}
		
		
	}

}
