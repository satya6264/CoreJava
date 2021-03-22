package com.vidvaan.encapsulation;

public class TestEncapsulation {
	public static void main(String[] args) {
		account acc = new account();
		acc.setacc_no(62409153362L);
		acc.setname("Satya");
		acc.setemail("satyaguduru20@gmail.com");
		acc.setamount(50000.00);
		System.out.println(acc.getname());
		System.out.println(acc.getacc_no());
		System.out.println(acc.getamount());
		System.out.println(acc.getemail());
	}

}
