package com.vidvaan.oops.encapsulation;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setSid(1001);
		s1.setSname("Harish");
		s1.setSfee(25000.00);
		//s1.display();
		System.out.println(s1.getSname());
	}

}
