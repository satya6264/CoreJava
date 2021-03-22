package com.vidvaan.MonthDay;

import java.time.LocalDate;
import java.time.MonthDay;

public class MonthDayExample1 {
	public static void main(String[] args) {
		
		MonthDay month = MonthDay.now();
		System.out.println(month);
		
		LocalDate date = month.atYear(2019);
		System.out.println(date);
		
		LocalDate date2 = MonthDay.now().atYear(2019);
		System.out.println(date2);
	}

}
