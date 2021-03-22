package com.vidvaan.clonning;
class Address implements Cloneable{
	String hNo = "2-119/1";
	String sName = "sr nagar";
	String city = "HYD";
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", sName=" + sName + ", city=" + city + "]";
	}
	@Override
	public Address clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Address)super.clone();
	}
	
}
class Employee implements Cloneable{
	String name = "Satya";
	String id = "a123";
	Address add = new Address();
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		Employee e = (Employee)super.clone();
		e.add = this.add.clone(); //Clone method of Address class
		return e;
	}
	
}

public class CloningDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee();
		System.out.println("----Original Object----");
		System.out.println(e1);
		System.out.println(e1.add);
		System.out.println("hashCode of e1="+e1.hashCode());
		Employee e2 = (Employee) e1.clone(); //cloning process
		System.out.println("----Cloned Object----");
		System.out.println(e2);
		System.out.println(e2.add);
		System.out.println("hashCode of e2="+e2.hashCode());
		if(e1.add==e2.add) {
			System.out.println("-----Shallow Cloning-----");
		}
		else {
			System.out.println("-----Deep Cloning-----");
		}
	}

}
