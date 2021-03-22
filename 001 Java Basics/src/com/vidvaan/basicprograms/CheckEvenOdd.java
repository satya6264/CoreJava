package com.vidvaan.basicprograms;

import java.util.Scanner;

public class CheckEvenOdd {
	
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("This is even number");
		}else {
			System.out.println("This is odd number");
		}
	}
	

}
