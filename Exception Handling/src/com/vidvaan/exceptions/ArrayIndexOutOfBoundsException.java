package com.vidvaan.exceptions;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 6, 7 };
		try {
			System.out.println(arr[4]);
		} catch (Exception e) {
			System.out.println("ArrayIndexOutOfBounds Exception");
		}
	}

}
