package com.vidvaan.collections.hashset.sorting;

import java.util.Comparator;

public class MycomparatorEno implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEid()>o2.getEid())
			return 1;
		if(o1.getEid()<o2.getEid())
			return -1;
		return 0;
	}

}
