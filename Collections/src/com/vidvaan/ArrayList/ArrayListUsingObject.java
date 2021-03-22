package com.vidvaan.ArrayList;

import java.util.*;

class Bike {
	String Bname;
	Double Bcost;
	int Bcc;

	public Bike(String bname, Double bcost, int bcc) {
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

	public Double getBcost() {
		return Bcost;
	}

	public void setBcost(Double bcost) {
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

public class ArrayListUsingObject {
	public static void main(String[] args) {
		Bike b1 = new Bike("Apache", 150000.00, 180);
		Bike b2 = new Bike("Glamour", 75000.00, 125);
		Bike b3 = new Bike("FZ-S", 95000.00, 150);
		List list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		System.out.println(list);
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
