package com.vidvaan.userdefinedexceptions;

public class Amount {

	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void amountAdder(Amount other) {
		if (!this.currency.equals(other.currency)) {
			throw new InsufficientCurrencyType("currency does not match");
		}
		this.amount = this.amount + other.amount;
	}

	public String toString() {
		return currency + " " + amount;
	}

	public static void main(String[] args) {
		Amount amount1 = new Amount("INR", 5000);
		Amount amount2 = new Amount("INk", 6000);
		amount1.amountAdder(amount2);
		System.out.println(amount1);
	}

}
