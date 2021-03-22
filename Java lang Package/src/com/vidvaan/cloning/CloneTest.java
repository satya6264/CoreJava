package com.vidvaan.cloning;

public class CloneTest {
public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address(1, "SKLM");
		Employee employee = new Employee(1001, "Balalji", address);
		System.out.println("Address : "+address);
		System.out.println("Employee : "+employee);
		
		Employee employeeClone = (Employee) employee.clone();
		
		address.setAloc("VSKP");
		System.out.println("Clone Address : "+employeeClone.getAddress());
		System.out.println("Clone Employee : "+employeeClone);
	}


}
