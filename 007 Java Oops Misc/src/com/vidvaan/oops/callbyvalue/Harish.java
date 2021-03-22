package com.vidvaan.oops.callbyvalue;

public class Harish {
	int a = 22;

	public void change(Harish a) {
		a.a=255;
	}
	

	public static void main(String[] args) {
		Harish a = new Harish();
		System.out.println("before change :" + a.a);
		a.change(a);
		System.out.println("after change:" + a.a);

	}
}
