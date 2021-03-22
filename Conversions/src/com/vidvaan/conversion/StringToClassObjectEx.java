package com.vidvaan.conversion;

public class StringToClassObjectEx {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("java.lang.String");
		System.out.println("Class name = " + c.getName());
		System.out.println("Super class name = " + c.getSuperclass().getName());
		//System.out.println(c.getSuperclass());
		//System.out.println(c.getName());

	}

}
