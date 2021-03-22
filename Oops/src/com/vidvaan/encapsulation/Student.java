package com.vidvaan.encapsulation;

public class Student {
	String Sname;
	int Scls;
	int Srnmbr;
	char Sgrade;

	Student() {

	}

	Student(String n, int c, int r, char g) {
		Sname = n;
		Scls = c;
		Srnmbr = r;
		Sgrade = g;

	}

	public void setSname(String n) {
		Sname = n;
	}

	public void SetScls(int c) {
		Scls = c;
	}

	public void setSrnmbr(int r) {
		Srnmbr = r;
	}

	public void setSgrade(char g) {
		Sgrade = g;
	}

	public String getSname() {
		return Sname;
	}

	public int getScls() {
		return Scls;
	}

	public int getSrnmbr() {
		return Srnmbr;
	}

	public char getSgrade() {
		return Sgrade;
	}

	void display() {
		System.out.println("Student Name:" + Sname);
		System.out.println("Student Class:" + Scls);
		System.out.println("Student Roll no:" + Srnmbr);
		System.out.println("Student Grade:" + Sgrade);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Sname = "Satya";
		s1.Scls = 1;
		s1.Srnmbr = 204;
		s1.Sgrade = 'D';
		s1.display();
		System.out.println();

		Student s2 = new Student();
		s2.setSname("Naresh");
		s2.SetScls(2);
		s2.setSrnmbr(209);
		s2.setSgrade('E');

		System.out.println("Student Name:" + s2.getSname());
		System.out.println("Student Class:" + s2.getScls());
		System.out.println("Student Roll no:" + s2.getSrnmbr());
		System.out.println("Stident Grade:" + s2.getSgrade());

	}

}
