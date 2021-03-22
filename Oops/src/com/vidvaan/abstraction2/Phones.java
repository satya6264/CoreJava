package com.vidvaan.abstraction2;

public interface Phones {
	public default void cost() {
		System.out.println("Cost : 20000.00");
	}
	
	void company();

	void model();

	void display();

	void ram();

	void memoery();

	void battery();

}
