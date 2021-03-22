package com.vidvaan.externalization;

import java.io.Externalizable;
import java.io.*;


public class Employee implements Externalizable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6588859392820022697L;
	private int eid;
	private String ename;
	private double esal;

	public Employee(int eid, String ename, double esal) {
		super();
		System.out.println("Employee");
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(eid + 100);
		out.writeDouble(esal);
		

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		eid = in.readInt()-100;
		esal = in.readDouble();
	}

}
