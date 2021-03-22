package com.vidvaan.conversions.inttolong;

public class IntToLongExample2 {

	public static void main(String[] args) {
		int i = 100;
		Long l1 = new Long(i);
		Long l2 = Long.valueOf(i);

		System.out.println(l1);
		System.out.println(l2);
	}

}
