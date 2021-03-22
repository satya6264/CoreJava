package com.vidvaan.TreeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class BufferArrayList {
	public static void main(String[] args) {
		DesStringBufferComparator desc = new DesStringBufferComparator();
		//DesStringComparator2 desc2 = new DesStringComparator2();
		TreeSet<StringBuffer> list = new TreeSet<StringBuffer>(desc);
		//TreeSet<StringBuffer> list = new TreeSet<StringBuffer>(desc2);
		//ArrayList list = new ArrayList();
		list.add(new StringBuffer("Satya"));
		list.add(new StringBuffer("Ravi"));
		list.add(new StringBuffer("Venkat"));
		list.add(new StringBuffer("Naresh"));
		System.out.println("Descending order : "+list);
		
//		Collections.sort(list, new DesStringComparator());
//		System.out.println(list);
//		Collections.sort(list, new DesStringComparator2());
//		System.out.println(list);
	}

}
