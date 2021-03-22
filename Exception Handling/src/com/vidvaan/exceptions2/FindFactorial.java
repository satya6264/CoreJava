package com.vidvaan.exceptions2;

//import java.io.IOException;
//import java.io.InputStreamReader;

public class FindFactorial {

	static int fact(int num) {
		if (num == 1) {
			return 1;
		}
		return num * fact(num - 1);
	}

	public static void main(String[] args) {

		int num = 7;

		System.out.println(fact(num));

//		InputStreamReader isr = new InputStreamReader(System.in);
//		try {
//			isr.read();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

}
