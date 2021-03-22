package com.vidvaan.memoryexplanation;

public class MemoryExplanation {

	public static void main(String[] args) {
		System.out.println("main begin");
		int num1 = 5;
		System.out.println("hi");

		Employee e = new Employee();
		e.setEno(123);
		e.setName("sekhar");
		e.setSalary(1234.56);

		display(e);

		System.out.println(e.getName());

		Person p = createPerson(45, "Eswar");
		display(p);
		System.out.println(num1);
		System.out.println("main end");
	}

	private static void display(Person p) {
		System.out.println(p.getPno());
		System.out.println(p.getName());

	}

	private static Person createPerson(int pno, String name) {
		Person person = new Person();
		person.setPno(pno);
		person.setName(name);

		return person;
	}

	private static void display(Employee emp) {
		System.out.println(emp.getName());
		System.out.println(emp.getEno());
		System.out.println(emp.getSalary());
		emp.setName("Mr." + emp.getName());
		int num2 = 6;
		System.out.println(num2);

	}
}
