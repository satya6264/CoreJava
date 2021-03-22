package com.vidvaan.anonymousclasses;

abstract class ABCD<T> {
	abstract T show(T a, T b);
}

public class AnonymousClassExample {
	public static void main(String[] args) {
		ABCD<String> a = new ABCD<String>() {
			String show(String a, String b) {
				return a+b;
			}
		};
		String result = a.show("java", "9");
		System.out.println(result);

	}
}
