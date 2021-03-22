package com.vidvaan.TreeSet;

import java.nio.channels.NetworkChannel;
import java.util.HashSet;
import java.util.TreeSet;

public class EmployeeTest {
	public static void main(String[] args) {
		//NameComparator comp = new NameComparator();
		//HashSet set = new HashSet();
		TreeSet set = new TreeSet();
		set.add(new Employee(101, "Satya"));
		set.add(new Employee(101, "Nresh"));
		set.add(new Employee(104, "Satya"));
		set.add(new Employee(103, "Raju"));
		set.add(new Employee(102, "Srikanth"));
		
//		set.add(101);
//		set.add(201);
//		set.add(301);
//		set.add(401);
//		set.add(501);
//		set.add(601);
		for (Object object : set) {
			System.out.println(object);
		}
		//System.out.println(set);
	}

}
