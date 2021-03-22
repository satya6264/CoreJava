package com.vidvaan.CallByValueAndCallByReference;

import javax.swing.text.ChangedCharSetException;

public class Person {
	int pid;
	String pname;
//	void change(int pid); {
////		this.pid;
//	}
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
	
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	Person(int pid,String pname){
		this.pid=pid;
		this.pname=pname;
		
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Person ps = new Person();
		ps.setPid(1001);
		ps.ChangeIt(1009);
		
		ps.setPname("Satya");
		System.out.println(ps.getPid());
		//ps.ChangeIt(1002);
		System.out.println(ps.getPname());
	}

	private static void ChangeIt(int i) {
		// TODO Auto-generated method stub
		
	}
	
	

}
