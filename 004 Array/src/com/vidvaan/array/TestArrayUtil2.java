package com.vidvaan.array;

public class TestArrayUtil2 {
	public static void main(String[] args) {
		ArrayUtil2 arrayUtil2 = new ArrayUtil2();
		//int arr[] = new int[5];
		int arr[]= {10,45,46,75,35};
		arrayUtil2.addElements(arr);

		arrayUtil2.print(arr);
		
		int max=arrayUtil2.findMax(arr);
		System.out.println("Maximum : "+max);
		
		int min = arrayUtil2.findMin(arr);
		System.out.println("Minimum : "+min);
		
		int sum = arrayUtil2.SumOfAllElements(arr);
		System.out.println("Sum of all elements : "+sum);
		
		int[] revArray=arrayUtil2.revArray(arr);
		System.out.println("Reverse Array : "+revArray);
	}

}
