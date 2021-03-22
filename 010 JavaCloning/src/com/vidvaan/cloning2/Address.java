package com.vidvaan.cloning2;

public class Address implements Cloneable {

	private String location;
	private String statte;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String location, String statte) {
		super();
		this.location = location;
		this.statte = statte;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatte() {
		return statte;
	}

	public void setStatte(String statte) {
		this.statte = statte;
	}

	@Override
	public String toString() {
		return "Address [location=" + location + ", statte=" + statte + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
