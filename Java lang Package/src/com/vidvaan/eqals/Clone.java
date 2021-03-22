package com.vidvaan.eqals;

public class Clone {
	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Satya", 30000.45);
		System.out.println(e1);
		try {
			Employee e2=(Employee) e1.clone();
			System.out.println(e2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
