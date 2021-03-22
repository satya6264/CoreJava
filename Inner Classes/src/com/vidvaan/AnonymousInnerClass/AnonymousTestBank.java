package com.vidvaan.AnonymousInnerClass;

public class AnonymousTestBank {
	public static void main(String[] args) {
		Bank SBI = new Bank() {
			
			@Override
			public void roi() {
				System.out.println("SBI rate of interest : 10%");
				
			}
		};
		Bank ICICI = new Bank() {
			
			@Override
			public void roi() {
				System.out.println("ICICI rate of interest : 15%");
				
			}
		};
		Bank Axis = new Bank() {
			
			@Override
			public void roi() {
				System.out.println("Axis rate of interest : 12%");
				
			}
		};
		SBI.roi();
		ICICI.roi();
		Axis.roi();
	}

}
