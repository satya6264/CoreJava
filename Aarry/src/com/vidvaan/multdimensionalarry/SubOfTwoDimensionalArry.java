package com.vidvaan.multdimensionalarry;

public class SubOfTwoDimensionalArry {
public static void main(String[] args) {
	int a[][]= {{5,6},{7,8}};
	int b[][]= {{2,1},{4,3}};
	int c[][]= new int[2][2];
	for (int i = 0; i < c.length; i++) {
	for (int j = 0; j < c.length; j++) {
		c[i][j]= a[i][j]-b[i][j];
		System.out.print(c[i][j]+ " ");
	}
	System.out.println();
	}
}
}
