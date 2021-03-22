package com.vidvaan.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerializatiin {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("Employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee employee = new Employee();
		employee.setEid(101);
		employee.setEname("Satya");
		employee.setSal(20000.00);
		oos.writeObject(employee);
		System.out.println("Serialization success");
		fos.close();
		oos.close();
	}

}
