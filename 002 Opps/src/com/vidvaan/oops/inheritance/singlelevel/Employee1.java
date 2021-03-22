package com.vidvaan.oops.inheritance.singlelevel;

public class Employee1 extends Employee {
	int id = 10;
	public static void main(String[] args) {
		Employee1 employee1 = new Employee1();
		System.out.println(employee1.id);
		employee1.name="sri";
		System.out.println(employee1.name);
		employee1.salary=3000;
		System.out.println(employee1.salary);
	}
	

}
