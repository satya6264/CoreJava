package com.vidvaan.oops.callbyvalue;

public class CallByValue {

	int data = 50;

	public void changeByValue(int data) {
		data = data + 100;
	}

	public void changeByRef(CallByValue cb) {
		cb.data = cb.data + 100;
	}

	public static void main(String[] args) {
		CallByValue cb = new CallByValue();
		System.out.println("Before change call by value : " + cb.data);
		cb.changeByValue(500);
		System.out.println("After change call by value : " + cb.data);
		System.out.println("-----------------------------");
		System.out.println("Before change call by reference : " + cb.data);
		cb.changeByRef(cb);
		System.out.println("After change call by reference : " + cb.data);

	}
}
