package com.vidvaan.oops.inheritance.multilevel;

public class Person2 extends Person1 {

	String company;

	@Override
	public void eat() {
		System.out.println("Harish eating...");
	}

	public static void main(String[] args) {
		Person2 person2 = new Person2();
		person2.age = 23;
		person2.gender = 'M';
		person2.name = "Harish";
		person2.company = "Google";
		person2.salary = 35000.00;
		person2.display();
		System.out.println("Company : " + person2.company);
		System.out.println("Salary : " + person2.salary);
		person2.eat();

	}

}
