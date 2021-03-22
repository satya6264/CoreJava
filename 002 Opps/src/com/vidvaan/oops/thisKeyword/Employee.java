package com.vidvaan.oops.thisKeyword;

public class Employee {

	private int eid;
	private String ename;
	private Double esal;
	
	public void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
	}
	
	
	public Employee() {
		this(1,"jsxhjx",65576.08);
		//System.out.println("Default");
		
	}


	public Employee(int eid, String ename, Double esal) {
		
		System.out.println("parameter");
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public Double getEsal() {
		return esal;
	}


	public void setEsal(Double esal) {
		this.esal = esal;
	}
	
	
	
}
