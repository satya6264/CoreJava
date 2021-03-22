package com.vidvaan.exceptions2;

public class ExceptionExample {
	public static void main(String[] args) {

		int a = 10;
		int b = 2;

		int arr[] = { 1, 2, 4 };

		try {
			//open connection
			System.out.println(a / b);
			System.out.println(arr[1]);
		String name = null;
		System.out.println(name.length());
			//close connection
			
		}

		catch (ArithmeticException e) {
			 e.printStackTrace();
			System.out.println(a / 2);
		} catch (ArrayIndexOutOfBoundsException e) {
			 e.printStackTrace();
			System.out.println(arr[0]);
		} catch (RuntimeException e) {
			System.out.println("Runtime");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
            System.out.println("i am finally");
		}

		System.out.println("End");

	}
}
