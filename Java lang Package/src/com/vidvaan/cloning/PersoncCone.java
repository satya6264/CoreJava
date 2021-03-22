package com.vidvaan.cloning;

public class PersoncCone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Name name = new Name("fname", "lname");
		Addr addr = new Addr("street", "city");
		Person person = new Person(name, addr);
		
		System.out.println("Before Cloneing: == > ");
		System.out.println(person.getName()+" : "+person.getAddr()+" : "+person);
		
		Person cloneObj = (Person) person.clone();
		System.out.println("After Cloneing: == > ");
		System.out.println(cloneObj.getName()+" : "+cloneObj.getAddr()+" : "+cloneObj);
	}


}
