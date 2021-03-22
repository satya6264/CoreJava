package com.vidvaan.stringjoinerclass;

import java.util.StringJoiner;

public class StringJoinerExample2 {
	public static void main(String[] args) {
		StringJoiner joinName = new StringJoiner(",", "[", "]");
		joinName.add("Satya");
		joinName.add("Mahesh");
		joinName.add("Ravi");
		joinName.add("Ravi");
		System.out.println(joinName);
	}

}
