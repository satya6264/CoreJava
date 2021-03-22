package com.vidvaan.array.assignment;

public class SumOfArry {
	public static void main(String[] args) {
		int arry[] = new int[] { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < arry.length; i++) {
			sum = sum + arry[i];
		}
		System.out.println("Sum of all the elements of an array = " + sum);
	}

}
