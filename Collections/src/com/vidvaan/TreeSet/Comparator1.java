package com.vidvaan.TreeSet;

import java.util.Comparator;

public class Comparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
			Integer i1=(Integer) o1;
			Integer i2=(Integer) o2;
			return i2-i1;
//			if (i1<i2) {
//				
//				return 1;
//			}
//			else if (i1>i2) {
//				return -1;
//				
//			}
//			else if (i1==i2) {
//				
//				return 0;
//			}
//			return 0;
//			
		}
	}

	
