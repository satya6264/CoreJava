package com.vidvaan.abstraction2;

public class TestMobiles {
	public static void main(String[] args) {
		Mobiles MotoG3 = new MotoG3();
		System.out.println("Moto G3 Specifications");
		MotoG3.cost();
		MotoG3.company();
		MotoG3.model();
		MotoG3.display();
		MotoG3.ram();
		MotoG3.memoery();
		MotoG3.battery();
		System.out.println("-------------");
		Mobiles SamsungA30 = new SamsungA30();
		System.out.println("Samsung A30 Specifications");
		SamsungA30.cost();
		SamsungA30.company();
		SamsungA30.model();
		SamsungA30.display();
		SamsungA30.ram();
		SamsungA30.memoery();
		SamsungA30.battery();

	}

}
