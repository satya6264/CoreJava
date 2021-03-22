package com.vidvaan.Java5features;

import java.util.ArrayList;

public class ForEachExample3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Satya");
		list.add("Naresh");
		list.add("Raju");
		list.add("Ravi");
		for (String s : list) {
			System.out.println(s);
		}
	}

}
