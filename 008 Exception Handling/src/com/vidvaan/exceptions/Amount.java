package com.vidvaan.exceptions;

import javax.management.RuntimeErrorException;

public class Amount {

	private String currency;
	private int amount;
	
	public Amount(String currency, int amount) {
		super();
		currency = currency;
		this.amount = amount;
	}

	public Amount() {
		super();
	}
	
	public void amountAdder(Amount other) {
		if(!this.currency.equals(other)) {
			throw new RuntimeException("currency does not match");
		}
		this.amount=this.amount+other.amount;
	}
	
	public String toString() {
		return currency+" "+amount;
	}
	
	public static void main(String[] args) {
		Amount amount1 = new Amount();
		
	}
}
