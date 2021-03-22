package com.vidvaan.assignment;

public class EmployeeEx {
	private int id;
	private String name;
	private double salary;
	private static String company;//use of static variable.

	EmployeeEx(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	EmployeeEx() {

	}

	public void display() {
		System.out.println("Id :" + id);
		System.out.println("Name :" + name);
		System.out.println("Salary :" + salary);
		System.out.println("company :" + company);
		System.out.println("-----------");
	}

	public static void main(String[] args) {
		EmployeeEx.company = "Smart Solutions";

		EmployeeEx e1 = new EmployeeEx(10001, "Naresh", 22000.00);
		e1.display();

		EmployeeEx e2 = new EmployeeEx(10002, "Kishore", 10000.00);
		e2.display();

		EmployeeEx e3 = new EmployeeEx(10003, "Pranay", 52000.00);
		e3.display();
	}

}
