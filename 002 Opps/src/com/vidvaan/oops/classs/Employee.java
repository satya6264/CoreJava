package com.vidvaan.oops.classs;

public class Employee {
	
	int eid;
	String ename;
	Double esal;
	
	public void InstDisplay() {
		System.out.println("Harish id : "+eid);
		System.out.println("Harish name : "+ename);
		System.out.println("Harish sal : "+esal);
		
		
	}
	
public static void main(String[] args) {
		int hid = 102;
		String ename = "veeru";
		Double esal = 200.00;
		
		System.out.println(hid);
		System.out.println(ename);
		System.out.println(esal);
		
		Employee employee = new Employee();
		employee.InstDisplay();
		
	}
	
	

}
