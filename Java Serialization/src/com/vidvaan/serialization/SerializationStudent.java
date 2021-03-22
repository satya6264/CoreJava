package com.vidvaan.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationStudent {
	public static void main(String[] args) {
		Student student = new Student(002, "Naresh", 4000.65);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("src/com/vidvaan/serialization/Student.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
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
