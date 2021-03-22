package com.vidvaan.localtime;

import java.time.LocalTime;

public class LocalTimeEx4 {
	public static void main(String[] args) {
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		LocalTime time2 = time1.plusHours(3);
		LocalTime time3 = time2.plusMinutes(15);
		System.out.println(time2);
	}

}
