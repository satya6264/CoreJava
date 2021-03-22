package com.vidvaan.LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx5 {
	public static void main(String[] args) {
		LocalDateTime datetime1 = LocalDateTime.now();
		LocalDateTime datetime2 = datetime1.minusDays(120);
		System.out.println("Before formating : " + datetime2);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = datetime2.format(format);
		System.out.println("After formating : " + formatDateTime);
	}

}
