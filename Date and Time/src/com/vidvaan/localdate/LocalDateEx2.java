package com.vidvaan.localdate;

import java.time.LocalDate;

public class LocalDateEx2 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2018, 1, 13);
		System.out.println(date1.isLeapYear());
		LocalDate date2 = LocalDate.of(2016, 3, 24);
		System.out.println(date2.isLeapYear());
		
		LocalDate d1 = LocalDate.of(2019, 12, 12);
		System.out.println(d1.plusMonths(2));
	}

}
