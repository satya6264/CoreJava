package com.vidvaan.practice;

public class OverloadingCalculation {
	void sum(int a, int b) {
		System.out.println("int arg method invoked");
		System.out.println(a + b);
	}

	void sum(long a, long b) {
		System.out.println("long arg method invoked");
		System.out.println(a + b);
	}

	public static void main(String args[]) {
		OverloadingCalculation obj = new OverloadingCalculation();
		obj.sum(20, 20);// now int arg sum() method gets invoked
		obj.sum(20, 20l);
	}

}
