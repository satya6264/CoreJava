package com.vidvaan.localtime;

import java.time.LocalTime;

public class LocalTimeEx3 {
	public static void main(String[] args) {
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		LocalTime time2 = time1.minusHours(2);
		LocalTime time3 = time2.minusMinutes(20);
		System.out.println(time3);

	}

}
