package com.vidvaan.array;

public class AnonymousArray {

	public void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		AnonymousArray array = new AnonymousArray();
		array.printArray(new int[] { 10, 20, 30, 40, 50 });
	}
}
