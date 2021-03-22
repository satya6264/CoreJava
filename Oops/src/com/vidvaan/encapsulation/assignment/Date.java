package com.vidvaan.encapsulation.assignment;

public class Date {
	int year;
	int month;
	int day;

	Date() {

	}

	Date(int y, int m, int d) {
		year = y;
		month = m;
		day = d;

	}

	public void setyear(int y) {
		year = y;
	}

	public void setmonth(int m) {
		month = m;
	}

	public void setday(int d) {
		day = d;
	}

	public int getyear() {
		return year;
	}

	public int getmonth() {
		return month;
	}

	public int getday() {
		return day;
	}

	void display() {
		System.out.println(day + "/" + month + "/" + year);
	}

	public static void main(String[] args) {
		Date d = new Date();
		d.setday(22);
		d.setmonth(8);
		d.setyear(2015);
		// d.display();
		System.out.println("Date : " + d.getday() + "/" + d.getmonth() + "/" + d.getyear());

	}

}
