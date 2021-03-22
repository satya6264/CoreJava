package com.vidvaan.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Account implements Externalizable {

	private int acNo;
	private String acName;
	private double acBalance;
	private double fd;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int acNo, String acName, double acBalance, double fd) {
		super();
		this.acNo = acNo;
		this.acName = acName;
		this.acBalance = acBalance;
		this.fd = fd;
	}
	

//	public Account(int acNo, String acName, double acBalance) {
//		super();
//		this.acNo = acNo;
//		this.acName = acName;
//		this.acBalance = acBalance;
//	}
	public int getAcNo() {
		return acNo;
	}

	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}

	public double getAcBalance() {
		return acBalance;
	}

	public void setAcBalance(double acBalance) {
		this.acBalance = acBalance;
	}

	public double getFd() {
		return fd;
	}

	public void setFd(double fd) {
		this.fd = fd;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(getAcNo());
		out.writeUTF(getAcName());
		out.writeDouble(getAcBalance());

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		setAcNo(in.readInt());
		setAcName(in.readUTF());
		setAcBalance(in.readDouble());
	}

}