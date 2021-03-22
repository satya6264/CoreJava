package com.vidvaan.memoryexplanation;

public class Employee {

	private int eno;
	private String name;
	private double salary;

	public Employee() {
	}

	public Employee(int eno, String name, double salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println(eno);
		System.out.println(name);
		System.out.println(salary);

	}
}
