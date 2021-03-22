package com.vidvaan.exceptions;

import org.omg.Messaging.SyncScopeHelper;

public class ArithmeticExceptionExa {
	int x;
	int y;

	public void divison() {
		
		
		int a = 30;
		int d = 40;
		int b = 0;
		System.out.println("sum method starts here");
		try {
		 int c = a/b;
		 
		 System.out.println("divison of two numbers"+c);
	
		 
		}catch(ArithmeticException e) {
			System.out.println("don't enter zeros");
		
		}
	try {
		int f = d/b;}
	catch(Exception e) {
		System.out.println("don't enter zeros");
	}
		
		System.out.println("write more code");
		
		
	}
	
	public static void main(String[] args) {
		ArithmeticExceptionExa demo=new ArithmeticExceptionExa();
		demo.divison();

			}

}
