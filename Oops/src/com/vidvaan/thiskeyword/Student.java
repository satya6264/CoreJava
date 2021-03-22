package com.vidvaan.thiskeyword;

public class Student {
	int id;
	String name;
	double fee;

	public Student(int id, String name, double fee) {
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	public void display() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Fee : " + fee);
		System.out.println("------------");
	}

	public static void main(String[] args) {
		Student s1 = new Student(10001, "Sharvan", 5000.00);
		Student s2 = new Student(10002, "Naresh", 5001.00);
		Student s3 = new Student(10003, "Raju", 7000.00);
		s1.display();
		s2.display();
		s3.display();
	}

}
