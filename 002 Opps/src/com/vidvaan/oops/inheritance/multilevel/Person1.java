package com.vidvaan.oops.inheritance.multilevel;

public class Person1 extends Human {

	double salary;

	@Override
	public void run() {
		System.out.println("Satya is running...");
	}

	public static void main(String[] args) {

		Person1 person = new Person1();
		person.name = "Satya";
		person.gender = 'M';
		person.age = 24;
		person.salary = 20000.00;
		person.display();
		System.out.println("Salary : " + person.salary);
		person.run();
	}

}
