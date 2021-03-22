package com.vidvaan.oops.callbyvalue;

public class CallbyValue2 {

	int a = 35;

//	public void change(int a) {
//		a=50;
//	}

	public void change(CallbyValue2 cv) {
		cv.a = 60;
	}

	public static void main(String[] args) {
		CallbyValue2 cv = new CallbyValue2();
		System.out.println("before change : " + cv.a);
		cv.change(cv);
		System.out.println("after change :" + cv.a);
	}
}
