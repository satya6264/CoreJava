package com.vidvaan.encapsulation;

public class Employee {
	int id;
	String name;
	double salary;
	String email;

	public Employee() {

	}

	public Employee(int i, String n, double s, String mail) {
		id = i;
		name = n;
		salary = s;
		email = mail;

	}

	public int getId() {
		return id;
	}

	public void setId(int i) {
		id = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double s) {
		salary = s;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String mail) {
		email = mail;
	}

	void display() {
		System.out.println(" ID : " + id + ", Name : " + name + ", Salary : " + salary + ", Email : " + email);
	}

	
	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Satya", 2000.00, "satyaguduru20@gmail.com");

		e1.display();

	}
}
