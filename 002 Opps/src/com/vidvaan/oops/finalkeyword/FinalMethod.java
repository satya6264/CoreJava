package com.vidvaan.oops.finalkeyword;

public class FinalMethod {
	
	final void run() {
		System.out.println("Veichle is running...");
	}
	public void stop() {
		System.out.println("Veichle is stopped...");
	}

}

class Car extends FinalMethod{
	
//	public void run() {           // We Can't ovverride the final method.
//		System.out.println("Car is running...");
//	}
	@Override
	public void stop() {
		System.out.println("Car is stopped");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.run();
		c.stop();
	}
}
