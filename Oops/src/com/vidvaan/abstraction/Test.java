package com.vidvaan.abstraction;

public class Test {
	public static void main(String[] args) {
		Network Jio = new Jio();
		System.out.println("Jio monthly plan :");
		Jio.sms();
		Jio.calls();
		Jio.data();
		Jio.isd();
		Network Idea = new Idea();
		System.out.println(" ");
		System.out.println("Idea monthly plan :");
		Idea.sms();
		Idea.calls();
		Idea.data();
		Idea.isd();
	}

}
