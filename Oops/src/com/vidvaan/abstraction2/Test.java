package com.vidvaan.abstraction2;

public class Test {
	public static void main(String[] args) {
		Network Airtel = new Airtel();
		System.out.println("Airtel Network Plan");
		Airtel.calls();
		Airtel.data();
		Airtel.sms();
		Airtel.isd();
		System.out.println("---------");
		Network Telinor = new Telinor();
		System.out.println("Telinor Network Plan");
		Telinor.calls();
		Telinor.data();
		Telinor.sms();
		Telinor.isd();
	}

}
