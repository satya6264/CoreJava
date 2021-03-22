package com.vidvaan.string.practice;

public class StringEx {

	public static void main(String[] args) {

//		String s = "Satya";
//		String p = "Satya";
//		
//		System.out.println(s.hashCode());
//		System.out.println(p.hashCode());
//		 s = s.concat(".G");
//
//		System.out.println(s.hashCode());

		// completed

//		String s1 = "Satya";
//		String s2 = "Satya";
//		String s3 = new String("Satya");
//		String s4 = "Guduru";
//		String s5 = "SATYA";
//
//		System.out.println("(Using Equals method)");
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
//		System.out.println(s1.equals(s4));
//		System.out.println("(Using equalsIgnoreCase method)");
//		System.out.println(s1.equals(s5));
//		System.out.println(s1.equalsIgnoreCase(s5));
//
//		System.out.println("(Using == method)");
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		System.out.println(s1 == s4);
//		System.out.println(s1 == s5);
//
//		System.out.println("(Using compareTo method)");
//
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareTo(s3));
//		System.out.println(s1.compareTo(s4));
//		System.out.println(s1.compareTo(s5));

		// Completed

//		System.out.println("Using By + (string concatenation) operator");
//		String s1 = "Satya";
//		String s2 = "Guduru";
//		String s3=s1+s2;
//		String s4="Satya"+"Guduru";
//		String s5="Satya"+s2;
//		String s6=(new StringBuilder()).append("Sachin").append(" Tendulkar").toString();
//		String s7=20+20+"Satya"+20+20;
//				
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);
//		System.out.println(s6);
//		System.out.println(s7);
//		
//		System.out.println("Using By concat() method");
//		System.out.println(s1.concat(s2));
//		System.out.println(s1.concat(s2)+"Satya"+s2);

		// Completed

//		String s ="SatyaGuduru";
//		
//		System.out.println("Using substring(beginIndex)");
//		System.out.println(s.substring(5));
//		System.out.println("Using substring(beginIndex, endIndex)");
//		System.out.println(s.substring(0, 5));

		// Completed

		String s = "Satya Guduru";
		String s1 = "    Satya Guduru";

		System.out.println("Java String toUpperCase() and toLowerCase() method");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		System.out.println("Java string trim() method");
		System.out.println(s1);
		System.out.println(s1.trim());
		
		System.out.println("Java String startsWith() and endsWith() method");
		System.out.println(s.startsWith("Sa"));
		System.out.println(s.endsWith("a"));
		
		System.out.println("Java String charAt() method");
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(6));
		
		System.out.println("Java String length() method");
		System.out.println(s.length());
		
		System.out.println("Java String intern() method");
		String s2 = s.intern();
		System.out.println(s2);
		
		System.out.println("Java String valueOf() method");
		int a = 10;
		String b = String.valueOf(a);
		System.out.println(b+10);
		System.out.println(10+b);
		
		System.out.println("Java String valueOf() method");
		String j="Java is a programming language. Java is a platform. Java is an Island.";
		String k=j.replace("Java", "Kava");
		System.out.println(j);
		System.out.println(k);
		System.out.println();

	}

}
