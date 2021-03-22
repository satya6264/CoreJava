package com.vidvaan.ArrayListSorting;

import java.util.Comparator;
class DesStringBufferComparator2 implements Comparator<StringBuffer> {

	@Override
public int compare(StringBuffer o1, StringBuffer o2) {
		
		return o1.toString().compareTo(o2.toString());
	}
	}
	


public class DesStringBufferComparator implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		
		return o2.toString().compareTo(o1.toString());
	}
	


	
	
	}


