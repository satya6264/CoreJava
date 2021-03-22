package com.vidvaan.constructor;

public class ConstructorStudent {
	private int id;
	private String name;

//	public ConstructorStudent(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}

	ConstructorStudent(int i, String n) {
		id = i;
		name = n;
	}

	void display() {

		System.out.println("ID No :" + id);
		System.out.println("Name :" + name);

	}

	public static void main(String[] args) {
		ConstructorStudent con = new ConstructorStudent(001, "Satya");
		con.display();
	}
}
