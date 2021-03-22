package com.vidvaan.inhertance;

public class Programmer extends Person {
	String dom;
	double salary;
	String company;
	
	public Programmer(){
		
	}
	public Programmer(int id, String name, long mobileno, String dom, double salary, String company){
		this.pid = id;
		this.pname = name;
		this.pmobilenum = mobileno;
		this.dom = dom;
		this.salary = salary;
		this.company = company;
		
	}
	public void display() {
		System.out.println("Id : "+pid);
		System.out.println("Name : "+pname);
		System.out.println("Mobile num : "+pmobilenum);
		System.out.println("Domaine : "+dom);
		System.out.println("Salary : "+salary);
		System.out.println("company : "+company);
	}
	public static void main(String[] args) {
		Programmer pro = new Programmer(1001,"Satya",359693589,"Java",20000.00,"Vidvaan");
		pro.display();
	}

}
