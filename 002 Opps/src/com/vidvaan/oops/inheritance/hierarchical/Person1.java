package com.vidvaan.oops.inheritance.hierarchical;

public class Person1 extends Human {
	
	@Override
	public void run() {
		System.out.println("Satya is running...");
	}

	public static void main(String[] args) {
		Person1 person = new Person1();
		person.name = "Satya";
		person.gender = 'M';
		person.age = 24;
		person.display();
		person.run();
	}

}
