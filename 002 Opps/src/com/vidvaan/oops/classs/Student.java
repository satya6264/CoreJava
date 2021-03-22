package com.vidvaan.oops.classs;

class Teacher {
	int tid;
	String tname;
	int tsal;

	public void display() {
		System.out.println("tid : " + tid);
		System.out.println("tname : " + tname);
		System.out.println("tfee : " + tsal);
	}

}

public class Student {

	int sid;
	String sname;
	Double sfee;

	public void display() {
		System.out.println("Sid : " + sid);
		System.out.println("Sname : " + sname);
		System.out.println("Sfee : " + sfee);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sid = 1001;
		s1.sname = "Harish";
		s1.sfee = 20000.00;
		s1.display();

		Student s2 = new Student();
		s2.sid = 13207;
		s2.sname = "sathya";
		s2.sfee = 1000.12;
		s2.display();

		Teacher t1 = new Teacher();
		t1.tid = 201;
		t1.tname = "anusha";
		t1.tsal = 25000;
		t1.display();

	}

}
