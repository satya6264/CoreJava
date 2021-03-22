package com.vidvaan.abstraction2;

public class Telinor implements Network{

	
	public void sms() {
		System.out.println("SMS : RC 100 GET 200 SMS");
		
	}

	
	public void calls() {
		System.out.println("CALLS : RC 100 GET 250TT");
		
	}

	
	public void data() {
		System.out.println("DATA : RC 100 GET 120GB");
		
	}

	
	public void isd() {
		System.out.println("ISD CALLS : 200 MINUTES");
		
	}

}
