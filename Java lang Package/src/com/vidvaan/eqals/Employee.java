package com.vidvaan.eqals;

public class Employee implements Cloneable {
	private int id;
	private String name;
	private double sal;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

//	@Override
//	public boolean equals(Object obj) {
//		try {
//			Employee e = (Employee) obj;
//			if (this.id == e.id && this.sal == e.sal && this.name.equals(e.name)) {
//				return true;
//			}
//			return false;
//		} catch (NullPointerException e) {
//			return false;
//		} catch (ClassCastException e) {
//			return false;
//		} catch (Exception e) {
//			return false;
//		}
//	}
//
//	@Override
//	public int hashCode() {
//		return (this.id + this.name.hashCode() + (int) (this.sal * 100));
//	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Balaji", 2001);
		Employee e2 = new Employee(1, "Balaji", 2001);
		Employee e3 = e1;

		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(sal) != Double.doubleToLongBits(other.sal))
			return false;
		return true;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	}


