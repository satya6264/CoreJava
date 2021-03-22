package com.vidvaan.cloning;

public class Addr implements Cloneable {
	private String street;
	private String city;
	public Addr(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	public Addr() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
