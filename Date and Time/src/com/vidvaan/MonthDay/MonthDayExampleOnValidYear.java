package com.vidvaan.MonthDay;

import java.time.MonthDay;

public class MonthDayExampleOnValidYear {
	public static void main(String[] args) {
		MonthDay month = MonthDay.now();
		System.out.println(month);
		boolean b = month.isValidYear(2019);
		System.out.println(b);
		
		MonthDay m2 = MonthDay.of(02, 29);
		boolean b2 = m2.isValidYear(2019);
		System.out.println(b2);
	}

}
