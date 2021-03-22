package com.vidvaan.InnerClasses;

public class Outer {
	public void display() {
		System.out.println("Display from Outer class");
	}

	static class sinner{
		public void display() {
			System.out.println("Display from Static Inner class");
		}
	}
	class Inner {
		public void display() {
			System.out.println("Display from Inner class");

			class Methodinner {
				public void display() {
					System.out.println("Display fromMethodinner class ");
				}
			}
			Methodinner methodinner = new Methodinner();
			methodinner.display();
		}

	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.display();

		Inner inner = outer.new Inner();
		inner.display();

		sinner i = new Outer.sinner();
		i.display();
	}

}
