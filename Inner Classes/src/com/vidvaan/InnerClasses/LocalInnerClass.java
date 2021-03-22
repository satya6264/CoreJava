package com.vidvaan.InnerClasses;

public class LocalInnerClass {
	public void display() {
		System.out.println("Dosplay from Outer class");
		class Local{
			public void display() {
				System.out.println("Display from Local class");
			}
		}
		Local local = new Local();
		local.display();
	}
	public static void main(String[] args) {
		LocalInnerClass localClass = new LocalInnerClass();
		localClass.display();
	}

}
