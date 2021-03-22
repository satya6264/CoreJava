package com.vidvaan.stringjoinerclass;

import java.util.StringJoiner;

public class StringJoinerExample3 {
	public static void main(String[] args) {
		StringJoiner joinName1 = new StringJoiner(",", "[", "]");
		joinName1.add("Satya");
		joinName1.add("Ravi");

		StringJoiner joinName2 = new StringJoiner(",", "[", "]");
		joinName2.add("Mahesh");
		joinName2.add("Suresh");

		StringJoiner merge = joinName1.merge(joinName2);
		System.out.println(merge);
	}

}
