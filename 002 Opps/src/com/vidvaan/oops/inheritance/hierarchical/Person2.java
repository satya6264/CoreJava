package com.vidvaan.oops.inheritance.hierarchical;

public class Person2 extends Human {
	
	@Override
	public void eat() {
		System.out.println("Harish is eating...");
	}

	public static void main(String[] args) {
		Person2 person = new Person2();
		person.name = "Harish";
		person.gender = 'M';
		person.age = 34;
		person.display();
		person.eat();
	}

}
