package com.vidvaan.thiskeyword;

public class A {
	public void m() {
		System.out.println("hello m");
	}

	public void n() {
		System.out.println("hello n");
		this.m();
	}

	public static void main(String[] args) {
		A a = new A();
		a.n();
	}

}
