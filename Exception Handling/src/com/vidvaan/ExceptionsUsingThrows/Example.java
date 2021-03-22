package com.vidvaan.ExceptionsUsingThrows;

public class Example {

	public static void div(int a, int b) {
		if (b != 0) {
			
			int c=a / b;
			System.out.println(c);
		
		}
		else {
			System.out.println("you entered wrong one");
			}

		
		//return a/b;
				
		

	}

	public static void main(String[] args) {
		
		div(10, 0);
		
		
		

		System.out.println("End");
	}
	

}
