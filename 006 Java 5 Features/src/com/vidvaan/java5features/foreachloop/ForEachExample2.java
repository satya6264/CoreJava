package com.vidvaan.java5features.foreachloop;

public class ForEachExample2 {

	public static void main(String[] args) {
		int arr[] = { 10, 23, 34, 45, 43 };
		int total = 0;
		for (int i : arr) {
			total = total + i;
		}
		System.out.println("Total = " + total);
	}
}
