package com.vidvaan.MonthDay;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MonthDayExampleOnRange {
	public static void main(String[] args) {
		MonthDay month = MonthDay.now();
		LocalDate m2 = MonthDay.of(6, 23).atYear(2016);
		
		ValueRange r1 = month.range(ChronoField.MONTH_OF_YEAR);
		System.out.println(r1);
		
		ValueRange r2 = month.range(ChronoField.DAY_OF_MONTH);
		System.out.println(r2);
		
		ValueRange r3 = m2.range(ChronoField.DAY_OF_YEAR);
		System.out.println(r3);
		
		
	}

}
