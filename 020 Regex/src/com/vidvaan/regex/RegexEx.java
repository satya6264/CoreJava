package com.vidvaan.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx {
	
	public static void main(String[] args) {
		
		Pattern P = Pattern.compile(".s");
		Matcher M = P.matcher("as");
		boolean b1 = M.matches();
		System.out.println(b1);
		
		boolean b2 = Pattern.compile(".s").matcher("as").matches();
		System.out.println(b2);
		
		boolean b3 = Pattern.matches(".s", "as");
		System.out.println(b3);
	}

}
