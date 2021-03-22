package com.vidvaan.oops.callbyvalue;

public class CallByValueExample2 {
	public void change(int eid) {
	     eid=eid+10;
	}

	public void change(Employee emp) {
		emp.setEid(1);
	}
	
	public static void main(String[] args) {
		int eid=10;
		
		CallByValueExample2 cv = new CallByValueExample2();
		System.out.println(eid);
		cv.change(eid);
		System.out.println(eid);
		System.out.println("------------------");
		Employee e = new Employee();
		e.setEid(2);
		System.out.println(e.getEid());
		cv.change(e);
		System.out.println(e.getEid());
		
	}
}

class Employee{
	private int eid;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
	
}
