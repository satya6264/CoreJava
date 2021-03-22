package com.vidvaan.ArrayListSorting;

public class Student {
	int Sid;
	String Sname;
	double Sfee;
	public Student(int sid, String sname, double sfee) {
		super();
		Sid = sid;
		Sname = sname;
		Sfee = sfee;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public double getSfee() {
		return Sfee;
	}
	public void setSfee(double sfee) {
		Sfee = sfee;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Sfee=" + Sfee + "]";
	}
	
	
}
