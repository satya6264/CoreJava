package com.vidvaan.abstraction2;

public interface Mobiles {
	public default void cost() {
		System.out.println("Cost : 10000.00");
	}
	
	void company();

	void model();

	void display();

	void ram();

	void memoery();

	void battery();

}
