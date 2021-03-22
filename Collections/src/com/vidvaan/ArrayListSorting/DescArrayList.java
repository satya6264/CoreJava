package com.vidvaan.ArrayListSorting;

import java.util.Comparator;

public class DescArrayList implements Comparator {

	@Override
	public int compare(Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		return (Integer)arg2-(Integer)arg1;
		
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		
//		return (Integer)o2-(Integer)o1;
//	}

}
