package com.vidvaan.localdate;

import java.time.LocalDate;

public class LocalDateEx1 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = date.plusDays(1);
		System.out.println("Today Date : " + date);
		System.out.println("Yesterday Date : " + yesterday);
		System.out.println("Tomorrow Date" + tomorrow);
		
		LocalDate tmrw = LocalDate.now().plusDays(1);
		System.out.println(tmrw);
		
		LocalDate ystrd = LocalDate.now().minusDays(1);
		System.out.println(ystrd);
		
	}

}
