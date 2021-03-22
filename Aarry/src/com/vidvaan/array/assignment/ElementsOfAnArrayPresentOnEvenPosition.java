package com.vidvaan.array.assignment;

public class ElementsOfAnArrayPresentOnEvenPosition {
	public static void main(String[] args) {
		int arry[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Elements of given arry present on even position");
		for (int i = 1; i < arry.length; i = i + 2) {
			System.out.print(arry[i]);
		}

	}

}
