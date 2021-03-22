package com.vidvaan.serialization;

import java.io.*;

public class DeserializationEmployee {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("src/com/vidvaan/serialization/Ser.ser");
			ois = new ObjectInputStream(fis);
			Employee employee = (Employee) ois.readObject();
			System.out.println(employee);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

}
