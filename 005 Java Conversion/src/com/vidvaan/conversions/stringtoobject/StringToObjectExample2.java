package com.vidvaan.conversions.stringtoobject;

public class StringToObjectExample2 {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("java.lang.String");
		System.out.println("Class name : " + c.getName());
		System.out.println("Super class name : " + c.getSuperclass().getName());
	}

}
