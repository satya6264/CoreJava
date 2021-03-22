package com.vidvaan.java7features.multiCatch;

public class TryWithMultiCatchEx2 {
	
	public static void main(String[] args) {
		int array[]= new int[10];
		try {
		array[9]=20/0;
		}catch(ArithmeticException|ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
