package com.vidvaan.cloning2;

public class EmployeeCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address();
		address.setLocation("Hyderabad");
		address.setStatte("Telangana");
		Employee original = new Employee();
		original.setEid(101);
		original.setEname("Satya");
		original.setEsal(12000.00);
		original.setAddress(address);
		System.out.println(original);
		System.out.println("----------------------");
		Employee cloned = (Employee) original.clone();
		System.out.println("before updating the data");
		System.out.println(original);
		System.out.println(cloned);
		original.getAddress().setLocation("Pune");
		original.getAddress().getLocation();
		System.out.println("after updating the data");
		System.out.println(original);
		System.out.println(cloned);

	}

}
