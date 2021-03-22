package com.vidvaan.oops.superkeyword;

public class SuperVariable {
	
	String colour = "White";

}
class Variable extends SuperVariable{
	String colour = "Green";
	void printColour() {
		System.out.println(colour);
		System.out.println(super.colour);
	}
	public static void main(String[] args) {
		Variable v = new Variable();
		v.printColour();
	}
}
