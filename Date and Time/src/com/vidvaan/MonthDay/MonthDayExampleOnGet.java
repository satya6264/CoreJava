package com.vidvaan.MonthDay;

import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class MonthDayExampleOnGet {
	public static void main(String[] args) {
		MonthDay monthDay = MonthDay.now();
		long m2 = monthDay.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(m2);
		
		MonthDay day = MonthDay.of(9, 23);
		long m3 = day.get(ChronoField.DAY_OF_MONTH);
		System.out.println(m3);
	}

}
