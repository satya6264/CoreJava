package com.vidvaan.assignment;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a values");
		
	 	int a=scanner.nextInt();
		System.out.println("a value is: "+a);
		System.out.println("enter b value");
		int b = scanner.nextInt();
		System.out.println("b value is "+b);
		System.out.println("sum of a and b:"+(a+b));
	}

}
