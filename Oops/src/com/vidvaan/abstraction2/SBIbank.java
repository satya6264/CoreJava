package com.vidvaan.abstraction2;

public class SBIbank implements Bank, RBI {

	@Override
	public void rateofinterest() {

		RBI.super.rateofinterest();
	}

	@Override
	public void rateofinterestongold() {
		System.out.println("Rate of Interest on Gold 4%");

	}

	@Override
	public void homeload() {
		System.out.println("Rate of interest on Homeloan 6%");

	}

}
