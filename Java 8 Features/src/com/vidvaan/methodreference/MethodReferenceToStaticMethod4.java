package com.vidvaan.methodreference;

import java.util.function.BiFunction;

class Math {
	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}
}

public class MethodReferenceToStaticMethod4 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder1 = Math::add;
		BiFunction<Integer, Float, Float> adder2 = Math::add;
		BiFunction<Float, Float, Float> adder3 = Math::add;
		int result1 = adder1.apply(10,20);
		float result2 = adder2.apply(10, 20.0f);
		float result3 = adder3.apply(20.0f, 30.0f);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
