package com.vidvaan.stringjoinerclass;

import java.util.StringJoiner;

public class StringJoinerExample1 {
	public static void main(String[] args) {
		StringJoiner joinName = new StringJoiner(",");
		joinName.add("Satya");
		joinName.add("Naresh");
		joinName.add("Anwar");
		joinName.add("Ravi");
		System.out.println(joinName);
	}

}
