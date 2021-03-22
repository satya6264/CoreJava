package com.vidvaan.abstraction2;

public interface RBI {
	public default void rateofinterest() {
		System.out.println("Rate of Interest 10.5%");
	}
	public void rateofinterestongold();
	public void homeload();

}
