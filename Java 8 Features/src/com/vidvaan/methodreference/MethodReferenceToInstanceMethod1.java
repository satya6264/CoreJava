package com.vidvaan.methodreference;

interface Sayablee {
	void sayy();
}

public class MethodReferenceToInstanceMethod1 {
	public void SaySomething() {
		System.out.println("Hello, this in non-static method");
	}
	public static void main(String[] args) {
		MethodReferenceToInstanceMethod1 MethodReference = new MethodReferenceToInstanceMethod1();
		Sayablee sayable = MethodReference::SaySomething;
		sayable.sayy();
		Sayablee sayable2= new MethodReferenceToInstanceMethod1()::SaySomething;
		sayable2.sayy();
	}

}
