package com.vidvaan.basics;

public class CalCulator {
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println("addition: " + (a + b));
	}

	public static void main(String[] args) {
		// int a =10;
//		CalCulator cal=new CalCulator();
//		cal.add();
		int principle = 20;
		int time = 154;
		int rate = 2;
		int simpleIntreset = (principle * time * rate) / 100;
		System.out.println("simple Intrest : " + simpleIntreset);
		
		String fname="venkat";
		String lname="ramana";
		String fullName=fname+" "+lname;
		System.out.println("person fullname: "+fullName);
	}

}
