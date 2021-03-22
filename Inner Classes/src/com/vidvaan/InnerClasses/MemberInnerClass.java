package com.vidvaan.InnerClasses;

public class MemberInnerClass {
	public void display() {
		System.out.println("Display from Outer claas");
	}
	class Inner{
		public void display() {
			System.out.println("Display from Member inner class");
		}
	}
	public static void main(String[] args) {
		MemberInnerClass outer = new MemberInnerClass();
		outer.display();
		
		Inner mi = outer.new Inner();
		mi.display();
	}

}
