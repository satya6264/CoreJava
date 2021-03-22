package com.vidvaan.oops.inheritance.singlelevel;

public class Harish {
	public void room() {
		System.out.println("veg cutting");
	}

}

class satya extends Harish {

	public void room() {
		System.out.println("cutting");
		super.room();
		
	}
}

class karthik extends satya {
	public void room2() {
		System.out.println("cooking");
		super.room();
	}

	public static void main(String[] args) {
		karthik h = new karthik();
		h.room();
//		h.room();
		h.room2();

	}
}
