package com.vidvaan.array;

public class ArryMin {
public static void main(String[] args) {
int arry[]= {10,20,30,5,50};
int min=arry[0];
for (int i = 0; i < arry.length;i++ ) {
	if(min>arry[i]) 
	min=arry[i];
	
	
}
System.out.println("Min=" +min);
}
}
