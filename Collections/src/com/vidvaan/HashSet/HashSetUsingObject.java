package com.vidvaan.HashSet;

import java.util.HashSet;
import java.util.Set;

class Bike {
	String Bname;
	int Bcost;
	int Bcc;
	public Bike(String bname, int bcost, int bcc) {
		super();
		Bname = bname;
		Bcost = bcost;
		Bcc = bcc;
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public int getBcost() {
		return Bcost;
	}
	public void setBcost(int bcost) {
		Bcost = bcost;
	}
	public int getBcc() {
		return Bcc;
	}
	public void setBcc(int bcc) {
		Bcc = bcc;
	}
	@Override
	public String toString() {
		return "Bike [Bname=" + Bname + ", Bcost=" + Bcost + ", Bcc=" + Bcc + "]";
	}
	
	
}

public class HashSetUsingObject {
	public static void main(String[] args) {
		Bike b1 = new Bike("Apache", 115000, 180);
		Bike b2 = new Bike("Glamour", 75000, 125);
		Set set = new HashSet();
		set.add(b1);
		set.add(b2);
		System.out.println(set);
		for (Object b : set) {
			System.out.println(b);
		}
	}

}
