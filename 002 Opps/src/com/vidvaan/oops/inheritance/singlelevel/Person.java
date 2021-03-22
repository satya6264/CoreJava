package com.vidvaan.oops.inheritance.singlelevel;

public class Person extends Human {
	
	@Override
	public void run() {
		System.out.println("Satya is running...");
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Satya";
		person.gender = 'M';
		person.age = 24;
		person.display();
		person.run();
	}

}
