package com.vidvaan.methodreference;

import java.util.function.BiFunction;

class Addition {
	public int add(int a, int b) {
		return a + b;
	}
}

public class MethodReferenceToInstanceMethod3 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = new Addition()::add;
		int result = adder.apply(20, 53);
		System.out.println(result);
	}
}
