package com.vidvaan.LinkedList;

import java.util.*;

class Employee{
	int Eid;
	String Ename;
	Double Esal;
	public Employee(int eid, String ename, Double esal) {
		super();
		Eid = eid;
		Ename = ename;
		Esal = esal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public Double getEsal() {
		return Esal;
	}
	public void setEsal(Double esal) {
		Esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Esal=" + Esal + "]";
	}
	
	
}

public class LinkedListUserObject {
	public static void main(String[] args) {
		Employee e1 = new Employee(001, "Satya", 20000.00);
		Employee e2 = new Employee(002, "Naresh", 25000.00);
		Employee e3 = new Employee(003, "Rakesh", 30000.00);
		List list = new LinkedList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		System.out.println(list.isEmpty());
		for (Object object : list) {
			System.out.println(object);
			
		}
		
	}
}
