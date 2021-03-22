package com.vidvaan.oops.inheritance.multilevel;

public class Human {

	int age;
	String name;
	char gender;

	public void eat() {
		System.out.println("Human can eat...");
	}

	public void talk() {
		System.out.println("Human can talk...");
	}

	public void walk() {
		System.out.println("Human can walk...");
	}

	public void run() {
		System.out.println("Human can run...");
	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
	}

}
