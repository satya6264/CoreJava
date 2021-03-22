package com.vidvaan.abstraction;

public class Jio extends Network {
	public void sms() {
		System.out.println("SMS : RC 100 GET UL SMS");
	}

	public void calls() {
		System.out.println("CALLS : RC 100 GET UL CALLS");
	}

	public void data() {
		System.out.println("DATA : RC 100 GET UL DATA");

	}

}
