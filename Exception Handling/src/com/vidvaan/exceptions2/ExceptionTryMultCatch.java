package com.vidvaan.exceptions2;

public class ExceptionTryMultCatch {
	public static void main(String[] args) {
		int a = 20;
		int b = 5;
		int arr[] = { 1, 2, 3, 4, 5 };
		String name = null;
		System.out.println(a / b);
		System.out.println(arr[4]);
		System.out.println(name);
		//System.out.println(name.length());
		try {
		System.out.println(a/0);
		System.out.println(arr[10]);
		System.out.println(name.length());
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(a/10);

		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(arr[0]);
		
	} catch (RuntimeException e) {
		System.out.println("Runtime");
	} catch (Exception e) {
		System.out.println("Exception");

		
		
	}
		finally {
            System.out.println("i am finally");
		}

		System.out.println("End");
}}


