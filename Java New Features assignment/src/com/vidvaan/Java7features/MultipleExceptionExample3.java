package com.vidvaan.Java7features;

public class MultipleExceptionExample3 {
	public static void main(String[] args) {
		try {
		int arry[]=new int[10];
		arry[10]=30/0;}
	// 	catch (ArithmeticException|ArrayIndexOutOfBoundsException|Exception e) { // we are getting compile time error
		catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		
		}
		
	}


