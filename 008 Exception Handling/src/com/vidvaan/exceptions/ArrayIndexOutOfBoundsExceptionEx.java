package com.vidvaan.exceptions;

public class ArrayIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		System.out.println("Statement 3");
		System.out.println("Statement 4");
		try {
			int arr[] = new int[5];
			arr[6] = 10;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array length is 6 only");
		}
		System.out.println("Statement 5");
		System.out.println("Statement 6");
		System.out.println("Statement 7");
		System.out.println("Statement 8");
		System.out.println("Statement 9");
	}
}
