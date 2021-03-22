package com.vidvaan.serialization2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("Emp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee employee = new Employee();
		employee.setEid(10101);
		employee.setUserName("Satya Guduru");
		employee.setPassoward("Satya1234");
		employee.setEmail("satyaguduru20@gmail.com");
		employee.setEsal(25000.00);
		oos.writeObject(employee);
		System.out.println("Serialization success");
		fos.close();
		oos.close();
	}

}
