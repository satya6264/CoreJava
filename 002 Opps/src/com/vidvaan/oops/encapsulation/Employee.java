package com.vidvaan.oops.encapsulation;

public class Employee {

	private int eid;
	private String ename;
	private Double esal;

	public void display() {
		System.out.println("Eid : " + eid);
		System.out.println("Ename : " + ename);
		System.out.println("Esal : " + esal);
	}

	public Employee() {

	}

	public Employee(int id, String name, Double sal) {
		eid = id;
		ename = name;
		esal = sal;
	}

	public void setEid(int id) {
		eid = id;
	}

	public int getEid() {
		return eid;
	}

	public void setEname(String name) {
		ename = name;
	}

	public String getEname() {
		return ename;
	}

	public void setEsal(Double sal) {
		esal = sal;
	}

	public Double getEsal() {
		return esal;
	}

}
