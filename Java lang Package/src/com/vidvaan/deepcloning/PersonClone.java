package com.vidvaan.deepcloning;

public class PersonClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Name name = new Name("firstname", "lastname");
		Address address = new Address("streat", "city");
		Person person = new Person(name, address);
		
		System.out.println("Before cloning:==>");
		System.out.println(person.getName() + ":" + person.getAddress() + ":" + person);
		name.setFirstname("Satya");
		name.setLastname("Guduru");
		address.setStreat("Pindiprolu");
		address.setCity("Khammam");


		Person cloneObj = (Person) person.clone();
		System.out.println("After cloning:==>");
		System.out.println(cloneObj.getName() + ":" + cloneObj.getAddress() + ":" + cloneObj);
	}


}
