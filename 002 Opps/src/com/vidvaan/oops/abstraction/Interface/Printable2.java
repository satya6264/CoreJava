package com.vidvaan.oops.abstraction.Interface;

public interface Printable2 {

	void print();

}

interface Showable2 {
	void print();
}

class Testing implements Printable2, Showable2 {

	@Override
	public void print() {
		System.out.println("Printing multiple Inheritance...");
	}

	public static void main(String[] args) {
		Testing testing = new Testing();
		testing.print();
	}
}
