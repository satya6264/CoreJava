package com.vidvaan.functionalinterface;

interface hello {
	void say(String msg);

	int hashCode();

	String toString();

	boolean equals(Object obj);
}

public class FunctionalInterfaceExample2 implements hello {

	@Override
	public void say(String msg) {
		System.out.println(msg);

	}

	public static void main(String[] args) {
		FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();
		fie.say("Hello");
	}

}
