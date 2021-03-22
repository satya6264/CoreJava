package com.vidvaan.conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateEx1 {
	public static void main(String[] args) throws ParseException {
		String sDate1 = "06/11/2019";
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		System.out.println(sDate1 + "\t" + date1);
	}

}
