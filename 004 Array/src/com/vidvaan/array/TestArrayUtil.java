package com.vidvaan.array;

public class TestArrayUtil {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		int arr[] = { 100, 200, 30, 4, 50 };

		 arr = arrayUtil.addElements(arr);

		arrayUtil.print(arr);
		int max = arrayUtil.findMax(arr);
		System.out.println("Max : " + max);
		
		System.out.println("Min : " + arrayUtil.findMin(arr));
		System.out.println("Sum : " + arrayUtil.findSumOfAllEle(arr));
		
		int[] revArr = arrayUtil.findRev(arr);
		
		arrayUtil.print(revArr);
		

	}

}

