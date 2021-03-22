package com.vidvaan.methodreference;

interface Sayable{
	void say();
}

public class MethodReferenceToStaticMethod {
	public static void saySomething() {
		System.out.println("Hello, this is staic method");
	}
	public static void main(String[] args) {
		Sayable sayable = MethodReferenceToStaticMethod::saySomething;
		sayable.say();
	}
}
