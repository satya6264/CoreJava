package com.vidvaan.ExceptionsUsingThrows;

public class ExceptionThrow {
	int sum(int a, int b)  {
		if (a < 0 || b < 0) {
			NotNegativeException n = new NotNegativeException(" A and B are not take negative values");
			throw n;
		}
		return a + b;
	}

	public static void main(String[] args) {
		ExceptionThrow et = new ExceptionThrow();
		int result;
		result = et.sum(10, -8);
		System.out.println(result);
		System.out.println("End");

	}
	
}
