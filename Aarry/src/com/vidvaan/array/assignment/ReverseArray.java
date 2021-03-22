package com.vidvaan.array.assignment;

public class ReverseArray {
	public static void main(String[] args) {
		int arry[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Original Array");
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + " ");
		}
		System.out.println();
		System.out.println("Array in reverse order");
		for (int i = arry.length - 1; i > 0 - 1; i--) {
			System.out.print(arry[i] + " ");

		}
	}

}
