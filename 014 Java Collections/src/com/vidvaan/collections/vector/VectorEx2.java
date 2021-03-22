package com.vidvaan.collections.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.addElement(2);
		vector.addElement(3);
		vector.addElement(4);
		vector.addElement(5);
		vector.addElement(6);
		vector.addElement(7);
		vector.addElement(8);
		vector.addElement(9);
		
		System.out.println("Before vector iteration : "+vector);
		
		Enumeration<Integer> enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			Integer i = enumeration.nextElement();
			if(i%2==0) {
				System.out.print(i+" ");
			}
//			else {
//				vector.remove(i);
//			}
		}
		System.out.println("\nfinal"+vector);
	}

}
