package com.vidvaan.array;

public class CloneArray {

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44 };
		System.out.println("Printing original array");
		for (int i : arr) {
			System.out.println(i);
		}

		int carr[] = arr.clone();
		System.out.println("Printing clone of the array");
		for (int i : carr) {
			System.out.println(i);

		}
		System.out.println("Are both eqal ?");
		System.out.println(arr == carr);

	}
}
