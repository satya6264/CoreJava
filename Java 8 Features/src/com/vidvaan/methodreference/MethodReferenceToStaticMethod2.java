package com.vidvaan.methodreference;

public class MethodReferenceToStaticMethod2 {
	public static void ThreadStatus() {
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(MethodReferenceToStaticMethod2::ThreadStatus);
		t1.start();
	}
}
