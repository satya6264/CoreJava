package com.vidvaan.assignment;

public class BlocksDemo {
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Instant Block");
	}

	public void m1() {
		System.out.println("Local Block");
	}

	public static void main(String[] args) {
		BlocksDemo d = new BlocksDemo();
		d.m1();
		new BlocksDemo();
		new BlocksDemo();
		new BlocksDemo();
	}

}
