package com.vidvaan.collections.hashset.sorting;

public class Employee {

	private int eid;
	private String ename;
	private double eal;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, double eal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eal = eal;
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

	public double getEal() {
		return eal;
	}

	public void setEal(double eal) {
		this.eal = eal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eal=" + eal + "]";
	}

}
