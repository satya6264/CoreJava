package com.vidvaan.conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class DateToStringEx1 {
	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String sDate = dateformat.format(date);
		System.out.println("Converted String : " + sDate);
	}

}
