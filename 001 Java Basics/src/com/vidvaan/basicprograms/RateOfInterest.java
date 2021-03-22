package com.vidvaan.basicprograms;

import java.util.Scanner;

public class RateOfInterest {

	public void simpleInterest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount");
		double amount = sc.nextDouble();
		System.out.println("Enter time");
		double time = sc.nextDouble();
		System.out.println("Enter rate of interest");
		double interest = sc.nextDouble();
		double si = ((amount * time * interest) / 100);
		System.out.println("Total Simpe interest : " + si);

	}

	public void compoundInterest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount");
		double amount = sc.nextDouble();
		System.out.println("Enter time");
		double time = sc.nextDouble();
		System.out.println("Enter rate of interest");
		double interest = sc.nextDouble();
		double ci = amount * Math.pow((1 + interest / 100), time);
		System.out.println("Total Compound Interst : " + ci);
	}

	public void rateOfInterest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount");
		double amount = sc.nextDouble();
		System.out.println("Enter time");
		double time = sc.nextDouble();
		System.out.println("Enter rate of interest");
		double interest = sc.nextDouble();
		double si = ((amount * time * interest) / 100);
		System.out.println("Total Simpe interest : " + si);
		double ci = (amount * Math.pow((1 + interest / 100), time)-amount);
		System.out.println("Total Compound Interst : " + ci);

	}

	public static void main(String[] args) {
		RateOfInterest ri = new RateOfInterest();
		// ri.simpleInterest();
//		ri.compoundInterest();
		ri.rateOfInterest();
	}

}
