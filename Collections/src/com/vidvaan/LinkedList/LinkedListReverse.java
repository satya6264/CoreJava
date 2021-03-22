package com.vidvaan.LinkedList;

import java.util.*;

class Mobile{
	String Mname;
	Double Mcost;
	public Mobile(String mname, Double mcost) {
		super();
		Mname = mname;
		Mcost = mcost;
	}
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public String getMname() {
		return Mname;
	}

	public void setMname(String mname) {
		Mname = mname;
	}

	public Double getMcost() {
		return Mcost;
	}

	public void setMcost(Double mcost) {
		Mcost = mcost;
	}

	@Override
	public String toString() {
		return "Mobile [Mname=" + Mname + ", Mcost=" + Mcost + "]";
	}
	
}
public class LinkedListReverse {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Moto", 10000.00);
		Mobile m2 = new Mobile("Samsung", 14000.00);
		List list = new LinkedList();
		list.add(m1);
		list.add(m2);
		System.out.println(list);
		for (Object object : list) {
			System.out.println(object);
		}
		
		}
	}
	


