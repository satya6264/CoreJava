package com.vidvaan.abstraction2;

public  class Airtel implements Network {

	
	public void sms() {
		System.out.println("SMS : RC 100 GET 120SMS");
		
	}

	
	public void calls() {
		System.out.println("CALLS : RC 100 GET 120TT");
		
	}

	
	public void data() {
		System.out.println("DATA : RC 100 GET 75 GB");
	}

	
	public void isd() {
		System.out.println("ISD CALLS : 100 MINUTES");
		
	}
	
	

}
