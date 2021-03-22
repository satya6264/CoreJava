package com.vidvaan.array;

public class ArryMax {
public static void main(String[] args) {
	int arry[]= {10,20,300,40,50};
	int max=arry[0];
	for (int i = 0; i < arry.length;i++ ) {
		if(max<arry[i]) 
		max=arry[i];

	}
	System.out.println("Max=" +max);
}
}