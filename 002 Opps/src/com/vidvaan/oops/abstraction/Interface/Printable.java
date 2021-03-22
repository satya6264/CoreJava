package com.vidvaan.oops.abstraction.Interface;

public interface Printable {

	void print();

}

class A6 implements Printable {

	@Override
	public void print() {
		System.out.println("Printing");
	}
	public static void main(String[] args) {
		A6 a = new A6();
		a.print();
	}

}
