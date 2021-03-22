package com.vidvaan.collections.crud;

public class Student implements Comparable<Student> {

	private int sid;
	private String sname;
	private Double sfee;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, Double sfee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Double getSfee() {
		return sfee;
	}

	public void setSfee(Double sfee) {
		this.sfee = sfee;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.sid > o.sid)
			return 1;
		if (this.sid < o.sid)
			return -1;
		return 0;
	}

}
