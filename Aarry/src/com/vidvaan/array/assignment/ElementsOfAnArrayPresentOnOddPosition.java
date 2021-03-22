package com.vidvaan.array.assignment;

public class ElementsOfAnArrayPresentOnOddPosition {
	public static void main(String[] args) {
		int arry[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(" Elements of given array present on odd position");
		for (int i = 0; i < arry.length; i = i + 2) {
			System.out.println(arry[i]);

		}
	}

}
