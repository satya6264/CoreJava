package com.vidvaan.TreeMap;

import java.util.TreeMap;

public class EmployeeMapTest {
	public static void main(String[] args) {
		TreeMap map = new TreeMap<>(new DescEmployeeMap());
		map.put(new EmployeeMap<>(101, "Satya"), "Satya");
		map.put(new EmployeeMap<>(101, "Raju"), "Satya");
		map.put(new EmployeeMap<>(104, "Nagaraju"), "Satya");
		map.put(new EmployeeMap<>(105, "Venkat"), "Satya");
		map.put(new EmployeeMap<>(103, "Shravan"), "Satya");
		System.out.println(map);
	}

}
