package com.vidvaan.StringAssignment;

public class Practice {
	public static void main(String[] args) {
		String s0="satya";
		String s = new String("satya");
		StringBuffer s1 = new StringBuffer("satya");
		StringBuilder s2 = new StringBuilder("satya");
		System.out.println(s0.equals(s1));

		boolean t = s1.equals(s);
		boolean t1 = s2.equals(s);
		System.out.println(t1);

//		System.out.println(t);
	}

}
