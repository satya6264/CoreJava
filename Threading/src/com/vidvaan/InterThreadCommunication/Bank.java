package com.vidvaan.InterThreadCommunication;

public class Bank {
	int totalAmount;

	public Bank(int totalAmount) {
		super();
		this.totalAmount = totalAmount;
	}
	
	public synchronized void withdraw(int Amount) {
		System.out.println("withdraw start...");
		if(totalAmount < Amount) {
			System.out.println("Insufficemt Amount You can continue after Deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		totalAmount = totalAmount-Amount;
		System.out.println(Amount +" Rupees withdraw successful, Your remaining balance: "+ totalAmount);
		System.out.println("withdraw end...");
	}
	public synchronized void Deposit(int Amount) {
		System.out.println("Deposit start...");
		totalAmount=totalAmount+Amount;
		System.out.println(Amount+" Rupees diposited successfully, Your total Amount is "+ totalAmount);
		notifyAll();
		System.out.println("Deposite end...");
	}

}
