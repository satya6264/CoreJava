package com.vidvaan.oops.abstraction.Interface;

public interface Printable3 {

	void print();

}

interface Showable3 extends Printable3 {
	void show();
}

class Testing3 implements Showable3 {

	@Override
	public void print() {
		System.out.println("Interface");
	}

	@Override
	public void show() {
		System.out.println("Inheritance");
	}

	public static void main(String[] args) {
		Testing3 testing3 = new Testing3();
		testing3.print();
		testing3.show();
	}

}