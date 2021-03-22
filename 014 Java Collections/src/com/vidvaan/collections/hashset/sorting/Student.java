package com.vidvaan.collections.hashset.sorting;

import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
	private int sid;
	private String sname;
	private double sfee;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, double sfee) {
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

	public double getSfee() {
		return sfee;
	}

	public void setSfee(double sfee) {
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

	public static void main(String[] args) {
		Set<Student> treeSet = new TreeSet<>();
		treeSet.add(new Student(102, "Satya", 20000.00));
		treeSet.add(new Student(105, "Harish", 25000.00));
		treeSet.add(new Student(101, "Naresh", 30000.00));
		treeSet.add(new Student(103, "Anwar", 28000.00));
		treeSet.add(new Student(104, "veeru", 23000.00));
		
		for (Student student : treeSet) {
			System.out.println(student);
		}
	}

}
