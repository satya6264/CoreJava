package com.vidvaan.TreeSet;

public class Student2 {
	StringBuffer sname;

	public Student2(StringBuffer sname) {
		super();
		this.sname = sname;
	}

	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StringBuffer getSname() {
		return sname;
	}

	public void setSname(StringBuffer sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + "]";
	}
	

	

}
