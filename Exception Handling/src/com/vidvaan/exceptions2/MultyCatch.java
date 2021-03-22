package com.vidvaan.exceptions2;

public class MultyCatch {
	public static void main(String[] args) {
		int a = 30;
		int b = 0;
		int arry[] = { 1, 2, 3, 4, 5 };
		String name = "Satya";

		try {
			System.out.println(a / 2);
			System.out.println(arry[2]);
			System.out.println(name.charAt(3));

		} catch (NullPointerException e) {
			System.out.println("null pointer exception occured");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic aexception occured");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String index out of bounds exception occured");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception occured");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println();
		} finally {
			System.out.println("success");
		}
		System.out.println("End");

	}
}