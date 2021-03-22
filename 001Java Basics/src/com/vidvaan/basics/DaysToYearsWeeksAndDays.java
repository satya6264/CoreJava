package com.vidvaan.basics;

public class DaysToYearsWeeksAndDays {
	public static void man(String[] args) {
		int d = 373;
		int y = d / 365;
		int w = (d - (y * 365)) / 7;
		int r = d - ((y * 365) + (w * 7));

		System.out.println("373 days=" + "years=" + y + "weeks=" + w + "days=" + r);

	}
}