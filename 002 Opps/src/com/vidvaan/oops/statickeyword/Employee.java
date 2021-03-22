package com.vidvaan.oops.statickeyword;

public class Employee {

	private int eid;
	private String ename;
	private double esal;
	private static String ecompany;

	public Employee() {

	}

	public Employee(int eid, String ename, double esal) {

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

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

//	public static String getEcompany() {
//		return ecompany;
//	}
//
//	public static void setEcompany(String ecompany) {
//		Employee.ecompany = ecompany;
//	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", ecompany=" + ecompany + "]";
	}

	public static void main(String[] args) {
		Employee.ecompany = "TCS";
		Employee e1 = new Employee();
		e1.setEid(101);
		e1.setEname("Satya");
		e1.setEsal(20000.00);
		System.out.println(e1.toString());

		Employee e2 = new Employee();
		System.out.println(e2.toString());
	}

}
