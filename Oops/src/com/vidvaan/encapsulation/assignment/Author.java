package com.vidvaan.encapsulation.assignment;

public class Author {
	String name;
	String email;
	String gender;

	Author() {

	}

	public Author(String n, String e, String g) {
		name = n;
		email = e;
		gender = g;

	}

	public void setname(String n) {
		name = n;
	}

	public void setemail(String e) {
		email = e;
	}

	public void setgender(String g) {
		gender = g;
	}

	public String getname() {
		return name;
	}

	public String getemail() {
		return email;
	}

	public String getgender() {
		return gender;
	}

//	void display() {
//		System.out.println("Name :" + name);
//		System.out.println("Email :" + email);
//		System.out.println("Gender :" + gender);
//	}

	public static void main(String[] args) {
		Author aut = new Author();
		aut.setname("Srikanth");
		aut.setemail("srikanthvk18@gmail.com");
		aut.setgender("M");
		//aut.display();
//		System.out.println("Name :" + aut.getname());
//		System.out.println("Email :" + aut.getemail());
	System.out.println("Gender :" + aut.getgender());

	}

}
