package com.vidvaan.nestedtryblock;

public class NestedTryBlock {

	public static void main(String[] args) {
		System.out.println("going to devide");
		try {
			try {
				int a = 10 / 0;
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException handeled");
			}
			int arr[] = new int[5];
			try {
				arr[5] = 50;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException handeled");
			}
		} catch (Exception e) {
			System.out.println("Exception handeled");
		}
		System.out.println("rest of the code");
	}
}
