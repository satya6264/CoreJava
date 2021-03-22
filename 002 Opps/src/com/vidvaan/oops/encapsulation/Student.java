package com.vidvaan.oops.encapsulation;

public class Student {

	private int sid;
	private String sname;
	private Double sfee;

//	public void display() {
//		System.out.println("Sid : " + sid);
//		System.out.println("Sname : " + sname);
//		System.out.println("Sfee : " + sfee);
//	}
	
	public Student() {
		
	}

	public Student(int id, String name, Double fee) {
		sid = id;
		sname = name;
		sfee = fee;
	}
	
	public void setSid(int id) {
		sid=id;
	}
	public int getSid() {
		return sid;
	}
	public void setSname(String name) {
		sname=name;
	}
	public String getSname() {
		return sname;
	}
	public void setSfee(Double fee) {
		sfee=fee;
	}
	public Double getSfee() {
		return sfee;
	}

}
