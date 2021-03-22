package com.vidvaan.array.assignment;

public class SmallestElementInArray {
	public static void main(String[] args) {
		int arry[] = new int[] { 15, 65, 34, 6, 62 };
		int min = arry[0];
		for (int i = 0; i < arry.length; i++) {
			if (arry[i] < min)
			min = arry[i];

		}
		System.out.println("Smallest element present in given array = " + min);
	}

}
