package com.vidvaan.cloning;

public class Address implements Cloneable {
	private int aid;
	private String aloc;
	public Address(int aid, String aloc) {
		super();
		this.aid = aid;
		this.aloc = aloc;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAloc() {
		return aloc;
	}
	public void setAloc(String aloc) {
		this.aloc = aloc;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", aloc=" + aloc + "]";
	}

}
