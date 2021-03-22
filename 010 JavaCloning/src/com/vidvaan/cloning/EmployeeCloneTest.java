package com.vidvaan.cloning;

public class EmployeeCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee original = new Employee();
		original.setEid(101);
		original.setEname("Satya");
		original.setEsal(20000.00);
		System.out.println(original);
		System.out.println("--------------------------");
		Employee cloned = (Employee) original.clone();
		System.out.println("Before updating the data :");
		System.out.println("Original : " + original);
		System.out.println("Cloned : " + cloned);
		original.setEsal(25000.00);
		System.out.println("After updating the data :");
		System.out.println("Original : " + original);
		System.out.println("Cloned : " + cloned);
	}
}
