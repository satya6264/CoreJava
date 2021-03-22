package com.vidvaan.inhertance;

public class Programmer2 extends Programmer {
//	public Programmer2() {
//		
//	}

//	public Programmer2(int i, String string, int j, String string2, double d, String string3) {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		Programmer2 prog = new Programmer2();
		prog.pid = 1002;
		prog.pname = "Naresh";
		prog.pmobilenum = 9652479050l;
		prog.dom = "kiliki";
		prog.salary = 20000.00;
		prog.company = "Richo";
		prog.display();
	}

}
