package com.vidvaan.serialization2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("Emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee employee = (Employee) ois.readObject();
		System.out.println("DeSerialization success");
		System.out.println(employee);
	}

}
