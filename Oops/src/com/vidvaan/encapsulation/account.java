package com.vidvaan.encapsulation;

public class account {
	private long acc_no;
	private String name;
	private String email;
	private double amount;

//	public account(double d) {
//
//		// TODO Auto-generated constructor stub
//	}

	public long getacc_no() {
		return acc_no;
	}

	public void setacc_no(long acc_n0) {
		this.acc_no = acc_no;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public double getamount() {
		return amount;
	}

	public void setamount(double amount) {
		this.amount = amount;
	}

//	void display() {
//		System.out.println(" Acc No:" + acc_no + " Name:" + name + " Email:" + email + " Amount:" + amount);
//	}
//	public static void main(String[] args) {
//		account ac= new account(2000.0);
//		ac.display();
//	}
	

}
