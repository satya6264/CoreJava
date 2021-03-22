package com.vidvaan.practice;

class Student{
	int id;
	String name;
	
	void insertValues(int i, String n) {
		id = i;
		name= n;
	}
	void display() {
		System.out.println(id +" "+name);
	}

	
}

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.insertValues(101, "Satya");
		s2.insertValues(102, "Anwar");
		s1.display();
		s2.display();
	}

}
