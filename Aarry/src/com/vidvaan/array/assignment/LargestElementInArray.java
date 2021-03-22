package com.vidvaan.array.assignment;

public class LargestElementInArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 22,14,33,16,15 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest element present in given array = " + max);
	}
}