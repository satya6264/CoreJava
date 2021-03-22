package com.vidvaan.java7features.multiCatch;

public class TryWithMultiCatchEx3 {

	public static void main(String[] args) {
		try {
			int array[] = new int[10];
			array[10] = 20 / 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
