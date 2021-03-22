package com.vidvaan.abstraction2;

public interface Bank {
	public default void rateofinterest() {
		System.out.println("Rate of Interest 8%");
	}
	void rateofinterestongold();
 void homeload();

}
