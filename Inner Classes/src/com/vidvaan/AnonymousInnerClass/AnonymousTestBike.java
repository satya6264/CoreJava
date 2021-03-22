package com.vidvaan.AnonymousInnerClass;

public class AnonymousTestBike {
	public static void main(String[] args) {
		Bike Apache = new Bike() {
			
			@Override
			public void model() {
				System.out.println("Model : Apache RTR 180");
			}
			
			@Override
			public void cost() {
				System.out.println("Cost : 120000.00");
				
			}
			
			@Override
			public void company() {
				System.out.println("Company : TVS");
				
			}
		};
		Bike Glamour = new Bike() {
			
			@Override
			public void model() {
				System.out.println("Model : Glamour");
				
			}
			
			@Override
			public void cost() {
				System.out.println("Cost : 75000.00");
				
			}
			
			@Override
			public void company() {
				System.out.println("Company : HERO");
				
			}
		};
		System.out.println("---Apache---");
		Apache.company();
		Apache.model();
		Apache.cost();
		System.out.println("---Glamour---");
		Glamour.company();
		Glamour.model();
		Glamour.cost();
	}

}
