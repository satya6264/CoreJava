package com.vidvaan.TreeMap;

import com.vidvaan.TreeSet.Employee;

public class EmployeeMap<T> implements Comparable<T> {
	int eid;
	String ename;
	public EmployeeMap(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public EmployeeMap() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "EmployeeMap [eid=" + eid + ", ename=" + ename + "]";
	}
	@Override
	public int compareTo(T o) {
		EmployeeMap e = (EmployeeMap) o;
		return this.eid-e.getEid()==0?(this.ename.compareTo(e.getEname())):this.eid-e.getEid();
	}

	
	
	

}
