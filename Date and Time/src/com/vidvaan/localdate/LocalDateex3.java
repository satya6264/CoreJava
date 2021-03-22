package com.vidvaan.localdate;

import java.time.*;

public class LocalDateex3 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2019, 11, 05);
		LocalDateTime datetime = date.atTime(12, 02, 56);
		System.out.println(datetime);
		
		LocalDateTime d1 = LocalDate.now().atTime(LocalTime.now());
		System.out.println(d1);
	}

}
