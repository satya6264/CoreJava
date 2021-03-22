package com.vidvaan.array;

public class ArrySumAndAvg {
public static void main(String[] args) {
	int arry[]= {10,20,30,40,50};
	System.out.println("Length=" +arry.length);
	int sum=0;
	for (int i = 0; i < arry.length; i++) {
		
		sum=sum+arry[i];
	}
	System.out.println("Sum=" +sum);
	System.out.println("Avg=" +sum/arry.length);
}
}
