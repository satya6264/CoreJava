package com.vidvaan.assignment;

public class StudentEx {
	private int id;
	private String name;
	private double fee;
	private static String school;

	public StudentEx(int id, String name, double fee) {
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	StudentEx() {

	}

	public void display() {
		System.out.println("Id :" + id);
		System.out.println("Name :" + name);
		System.out.println("Fee :" + fee);
		System.out.println("School :" + school);
		System.out.println("-------------");

	}

	public static void main(String[] args) {
		StudentEx.school = "Vidvaan";
		//StudentEx.school = "Java";

		StudentEx s1 = new StudentEx(1001, "Satya", 20000.00);
		s1.display();

		StudentEx s2 = new StudentEx(1002, "Shravan", 5000.00);
		s2.display();

		StudentEx s3 = new StudentEx(1003, "Naga", 5001.00);
		s3.display();
	}

}
