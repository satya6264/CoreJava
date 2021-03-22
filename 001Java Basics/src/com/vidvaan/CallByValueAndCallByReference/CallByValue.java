package com.vidvaan.CallByValueAndCallByReference;

public class CallByValue {
	int a = 200;

	void change(int a) {
		a = a + 100;
	}

	public static void main(String[] args) {
		CallByValue cv = new CallByValue();
		System.out.println("before change : " + cv.a);
		cv.change(400);
		System.out.println("after change : " + cv.a);
	}

}
