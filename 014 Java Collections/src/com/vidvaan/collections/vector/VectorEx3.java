package com.vidvaan.collections.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx3 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		vector.add(6);
		vector.add(7);
		vector.add(8);
		vector.add(9);

		System.out.println("Before vector iteration : " + vector);
		Iterator<Integer> iterator = vector.iterator();
		while (iterator.hasNext()) {

			Integer i = iterator.next();
			if (i % 2 == 0) {
				System.out.print(i+" ");
			}else {
				iterator.remove();
			}
		}
		System.out.println("\nAfter vector iteration: " +vector);
	}

}
