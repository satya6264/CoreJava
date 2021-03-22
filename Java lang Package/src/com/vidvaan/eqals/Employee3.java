package com.vidvaan.eqals;

public class Employee3 {
	private int id;
	private int name;
	private double sal;

	public Employee3(int id, int name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public Employee3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Employee3 e1 = new Employee3();
		Employee3 e2 = new Employee3();
		Employee3 e3 = e1;
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + name;
		long temp;
		temp = Double.doubleToLongBits(sal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee3 other = (Employee3) obj;
		if (id != other.id)
			return false;
		if (name != other.name)
			return false;
		if (Double.doubleToLongBits(sal) != Double.doubleToLongBits(other.sal))
			return false;
		return true;
	}

}
