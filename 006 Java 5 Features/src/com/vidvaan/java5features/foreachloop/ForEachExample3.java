package com.vidvaan.java5features.foreachloop;

import java.util.ArrayList;

public class ForEachExample3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Satya");
		list.add("Naresh");
		list.add("HArish");
		for (String s : list) {
			System.out.println(s);
		}
	}
}
