package com.vidvaan.oops.abstraction.Interface;

public interface Showable {
	void show();

}
interface Prntable {
	void print();
}
class Test implements Showable,Prntable{

	@Override
	public void print() {
System.out.println("Printing...");		
	}

	@Override
	public void show() {
System.out.println("Showing...");		
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.show();
		test.print();
	}
}
