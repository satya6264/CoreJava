package com.vidvaan.cloning;

public class Person implements Cloneable{
	private Name name;
	private Addr addr;

	public Person(Name name, Addr addr) {
		super();
		this.name = name;
		this.addr = addr;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Addr getAddr() {
		return addr;
	}

	public void setAddr(Addr addr) {
		this.addr = addr;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Person person = (Person) super.clone();
		person.setName((Name)name.clone());
		person.setAddr((Addr)addr.clone());
		return person;
	}


}
