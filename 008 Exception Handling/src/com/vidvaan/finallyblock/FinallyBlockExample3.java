package com.vidvaan.finallyblock;

public class FinallyBlockExample3 {

	public static void main(String[] args) {
		try {
			int a = 25 / 0;
			System.out.println(a);
		} finally {
			System.out.println("finally block executed");
		}
		System.out.println("rest of the code");
	}
}
