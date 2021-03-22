package com.vidvaan.functionalinterface;

interface Doit {
	default void doIt() {
		System.out.println("Do it now");
	}
}

interface tell extends Doit {
	void hi(String msg);

}

public class FunctionalInterfaceExample3 implements tell {

	@Override
	public void hi(String msg) {
		System.out.println(msg);

	}

	public static void main(String[] args) {
		FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();
		fie.hi("Hello");
		fie.doIt();
	}

}
