package com.vidvaan.serialization2;

import java.io.Serializable;

public class Employee implements Serializable {

	private int eid;
	private String userName;
	private transient String passoward;
	private String email;
	private double esal;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String userName, String passoward, String email, double esal) {
		super();
		this.eid = eid;
		this.userName = userName;
		this.passoward = passoward;
		this.email = email;
		this.esal = esal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassoward() {
		return passoward;
	}

	public void setPassoward(String passoward) {
		this.passoward = passoward;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", userName=" + userName + ", passoward=" + passoward + ", email=" + email
				+ ", esal=" + esal + "]";
	}

}
