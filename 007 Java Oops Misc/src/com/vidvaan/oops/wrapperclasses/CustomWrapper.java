package com.vidvaan.oops.wrapperclasses;

public class CustomWrapper {

	private int i;

	public CustomWrapper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomWrapper(int i) {
		super();
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return Integer.toString(i);
	}

	public static void main(String[] args) {

		CustomWrapper cw = new CustomWrapper(10);
		System.out.println(cw);
		
//		Autoboxing
		int c = 30;
		Integer d = new Integer(c);    // Using Conversions
		Integer e = c;                 // Using Autoboxing
		System.out.println(d+" "+e);
		
//		Unboxing
		Integer i = new Integer(20); 
		int a = i.intValue();         // Using Conversion
		int b = i;                    // Using Unboxing 
		System.out.println(a+" "+b);
		
		
		
	}
}
