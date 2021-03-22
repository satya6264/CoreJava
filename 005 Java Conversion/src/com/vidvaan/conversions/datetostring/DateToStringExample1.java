package com.vidvaan.conversions.datetostring;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToStringExample1 {

	public static void main(String[] args) {

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		String strDate = dateFormat.format(date);

		System.out.println(strDate);
	}

}
