package com.vidvaan.InterThreadCommunication;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank(200);
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				bank.withdraw(1000);				
			}
		};
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				bank.Deposit(40000);
				
			}
		};
		Thread withdraw = new Thread(r1);
		withdraw.start();
		
		Thread Deposite = new Thread(r2);
		Deposite.start();
	}

}
