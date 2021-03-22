package com.vidvaan.encapsulation.assignment;

public class Account {
	int acc;
	double balance;

	Account() {

	}

	Account(int ac, double bal) {
		int acc = ac;
		double balance = bal;
	}

	public void setacc(int ac) {
		acc = ac;
	}

	public void setbalance(double bal) {
		balance = bal;

	}

	public int getacc() {
		return acc;
	}

	public double getbalance() {
		return balance;
	}

	public void Credit(int amt) {
		if (balance > amt)
			;
		balance = balance + amt;
		System.out.println("acc :" + acc + "Credit :" + balance);

	}

	public void debit(int amt) {
		if (balance > amt)
			;
		balance = balance - amt;
		System.out.println("acc :" + acc + "Debit :" + balance);

	}

	void display() {
		System.out.println("balance:" + balance);
	}

	public static void main(String[] args) {
		Account ac = new Account();
		ac.acc = 254624;
		ac.balance = 2500.00;

		System.out.println(ac.getbalance());

	}

}
