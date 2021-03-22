package com.vidvaan.conversion;

import java.sql.Timestamp;
import java.util.Date;

public class TimestampToDateEx2 {

	public static class TimestampToDateExample2 {
		public static void main(String args[]) {
			Timestamp ts = new Timestamp(System.currentTimeMillis());
			Date date = ts;
			System.out.println(date);
		}
	}

}
