package com.vidvaan.conversions.stringtodate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample1 {

	public static void main(String[] args) throws Exception {

		String sDate = "22/02/2020";
		Date date = new SimpleDateFormat("dd/mm/yyyy").parse(sDate);
		System.out.println(sDate + "\t" + date);
	}

}
