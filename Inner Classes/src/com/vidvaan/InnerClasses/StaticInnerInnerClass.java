package com.vidvaan.InnerClasses;

public class StaticInnerInnerClass {
	public void display() {
		int id = 25;
		String name = "Satya" ;
		System.out.println("Display from Outer class");
		System.out.println("Id = "+id+" & Name = "+name);
	}
	static class Inner{
		public void display() {
			int id = 23;
			String name = "Naresh";
			System.out.println("Display from Static Inner class");
			System.out.println("Id = "+id+" & Name = "+name);
		}
	}
	public static void main(String[] args) {
		StaticInnerInnerClass staticInnerClass = new StaticInnerInnerClass();
		staticInnerClass.display();
		
		Inner inner = new StaticInnerInnerClass.Inner();
		inner.display();
	}

}
