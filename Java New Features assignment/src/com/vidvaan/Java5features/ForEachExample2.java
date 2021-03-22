package com.vidvaan.Java5features;

public class ForEachExample2 {
	public static void main(String[] args) {
		int arr[] = { 12, 13, 14, 15 };
		int total = 0;
		for (int i : arr) {
			total = total + i;
		}
		System.out.println("Total=" + total);
	}

}
