package com.vidvaan.array.assignment;

public class ThirdLargestElementInArray {
	public static int getThirdLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		return a[total - 3];

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 7, 2, 8 };
		int b[] = { 44, 55, 88, 33, 77, 66, 22 };
		System.out.println("Third Largest Element = " + getThirdLargest(a, 6));
		System.out.println("Third Largest Element = " + getThirdLargest(b, 7));
	}

}
