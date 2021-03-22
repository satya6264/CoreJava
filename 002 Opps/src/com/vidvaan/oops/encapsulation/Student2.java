package com.vidvaan.oops.encapsulation;

public class Student2 {

	private String sname;
	private int sgpa;

	public Student2() {

	}

	public Student2(String name) {
		sname = name;
		
	}
	
	public void display() {
		System.out.println("Sgap : "+sgpa);
	}

	public String getSname() {
		return sname;
	}

	public void setSgpa(int gpa) {
		sgpa = gpa;
	}
	
	public static void main(String[] args) {
		Student2 s= new Student2("Satya");
		s.setSgpa(5);
		System.out.println("Sname :"+s.getSname());
		s.display();
	}

}
