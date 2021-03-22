package com.vidvaan.abstraction;

public class Idea extends Network {
	public void sms() {
		System.out.println("SMS : RC 100 GET 1000SMS");
	}
	public void calls() {
		System.out.println("CALLS : RC 100 GET 110 TT");
	}
	public void data() {
		System.out.println("DATA : RC 100 GET 100 GB");
	}

}
