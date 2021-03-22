package com.vidvaan.exceptions;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		int arr[] = {10,20,30,40};
	
		for (int i : arr) {
			System.out.print(arr[2]);
		}
	}
}
