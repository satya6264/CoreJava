package com.vidvaan.array;

import java.util.Scanner;

public class ArrayUtil {

	public int[] addElements(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elemets :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public void print(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;
	}

	public int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		return min;
	}

	public int findSumOfAllEle(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		return sum;
	}

	public int[] findRev(int[] arr) {
		int revArr[] = new int[arr.length];

		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			revArr[j] = arr[i];
		}

		return revArr;
	}

}
