package com.vidvaan.TreeMap;

import java.util.Comparator;

public class DescEmployeeMap implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		EmployeeMap e1 = (EmployeeMap) o1;
		EmployeeMap e2 = (EmployeeMap) o2;
		return e1.getEname().compareTo(e2.getEname());
		
	}

}
