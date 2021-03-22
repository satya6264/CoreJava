package com.vidvaan.serialization;

import java.io.*;

public class SerializationEmployee{

	public static void main(String[] args) {
		Employee employee = new Employee(001, "Satya", 10000.00);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("src/com/vidvaan/serialization/Ser.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
			System.out.println("Success");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();

		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
