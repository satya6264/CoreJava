package com.vidvaan.methodreference;

public class MethodReferenceToInstanceMethod2 {
	public void printMsg(){
		System.out.println("Hello, this is instance method");
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new MethodReferenceToInstanceMethod2()::printMsg);
		t1.start();
	}
}
