package com.vidvaan.CallByValueAndCallByReference;

public class CallByReference {
	String s = "Satya";

	void change(CallByReference cb) {
		cb.s = "Mahesh";
	}

	public static void main(String args[]) {
		CallByReference cb = new CallByReference();

		System.out.println("before change : " + cb.s);
		cb.change(cb);
		System.out.println("after change : " + cb.s);

	}

}
