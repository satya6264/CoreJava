package com.vidvaan.deepcloning;

public class Person implements Cloneable {
	private Name name;
	private Address address;

	public Person(Name name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person person=(Person)super.clone();
		person.setName((Name)name.clone());
		person.setAddress((Address)person.getAddress().clone());
		return person;
		
	}

}
