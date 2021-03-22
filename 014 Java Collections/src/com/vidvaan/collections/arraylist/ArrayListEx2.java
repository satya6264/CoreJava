package com.vidvaan.collections.arraylist;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// using generics we are providing type safety
		ArrayList<String> colours = new ArrayList<>();
		colours.add("RED");
		colours.add("WHITE");
		colours.add("BLACK");
		colours.add("YELLOW");
		colours.add("GREEN");
		System.out.println(colours);

	}

}
