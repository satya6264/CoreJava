package com.vidvaan.oops.abstraction.abstractt;

interface A {
	void a();

	void b();

	void c();

	void d();
}

public abstract class B implements A {
	public void c() {
		System.out.println("I am C");
	}

}
class C extends B{

	@Override
	public void a() {
		System.out.println("I am A");
		
	}

	@Override
	public void b() {
		System.out.println("I am B");
		
	}

	@Override
	public void d() {
		System.out.println("I am D");
		
	}
	public static void main(String[] args) {
		A a = new C();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}
