package com.vidvaan.conversion;

class Emp {
}

public class ObjectToStringEx1 {
	public static void main(String[] args) {
		Emp e = new Emp();
		String s = e.toString();
		String s2 = String.valueOf(e);
		System.out.println(s);
		System.out.println(s2);
	}

}
