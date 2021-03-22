package com.vidvaan.ArrayListSorting;

import java.util.Comparator;

public class AsssComparater implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student e=(Student) o1;
		Student s=(Student) o2;
		return e.getSid()-s.getSid();
	}
	

}
