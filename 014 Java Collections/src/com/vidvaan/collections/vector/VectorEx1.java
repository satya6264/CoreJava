package com.vidvaan.collections.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("item 1");
		vector.addElement("item 2");
		vector.addElement("item 3");
		vector.addElement("item 4");
		vector.addElement("item 5");
		vector.addElement("item 6");
		vector.addElement("item 7");
		vector.addElement("item 8");
		vector.addElement("item 9");

		System.out.println(vector);

		System.out.println("Using enumeration");
		Enumeration<String> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

		System.out.println("Using for loop");
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}

		System.out.println("Using for each loop");
		for (String string : vector) {
			System.out.println(string);
		}

		System.out.println("Using while loop");
		int i = 0;
		while (vector.size() > i) {
			System.out.println(vector.get(i));
			i++;
		}

		System.out.println("Using iterator");
		Iterator<String> itr = vector.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
