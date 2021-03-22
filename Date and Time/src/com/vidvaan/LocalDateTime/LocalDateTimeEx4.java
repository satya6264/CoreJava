package com.vidvaan.LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx4 {
	public static void main(String[] args) {
		LocalDateTime datetime1 = LocalDateTime.of(2019, 11, 05, 15, 17);
		LocalDateTime datetime2 = datetime1.plusDays(120);
		System.out.println("Before formatting : " + datetime2);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String formatDateTime = datetime2.format(format);
		System.out.println("After formating : " + formatDateTime);
	}

}
