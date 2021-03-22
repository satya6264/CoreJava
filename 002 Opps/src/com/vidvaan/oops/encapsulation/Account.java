package com.vidvaan.oops.encapsulation;

public class Account {

	private int acNumber;
	private double balance;

	public Account() {

	}

	public Account(int acNumber, double balance) {
		this.acNumber = acNumber;
		this.balance = balance;
	}

	public Account(int acNumber) {
		this.acNumber = acNumber;
	}

	public int getAcNumber() {
		return acNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void credit(double amount) {
		balance = balance + amount;
		System.out.println(balance + " rupees Credited"); 
	}

	public void debit(double amount) {
		if (balance >= amount) {
			System.out.println(amount + "debited" + ",remaining balance is " + (balance = balance - amount));
		} else {
			System.out.println("Insufficient fund");
		}
	}

	public String toString() {
		return "Account[AcNumber=" + acNumber + ",Balance=" + balance + "]";
	}

	public static void main(String[] args) {
		Account ac = new Account();
		ac.credit(20000);
		ac.debit(2000.65);
	}

}
