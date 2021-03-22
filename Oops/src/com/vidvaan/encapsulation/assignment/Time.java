package com.vidvaan.encapsulation.assignment;

public class Time {
	int sec;
	int min;
	int hrs;

	Time() {

	}

	Time(int s, int m, int h) {
		sec = s;
		min = m;
		hrs = h;
	}

	public void setsec(int s) {
		sec = s;
	}

	public void setmin(int m) {
		min = m;
	}

	public void sethrs(int h) {
		hrs = h;
	}

	public int getsec() {
		return sec;
	}

	public int getmin() {
		return min;
	}

	public int gethrs() {
		return hrs;
	}

	void display() {
		System.out.println(hrs + "/" + min + "/" + sec);
	}

	public static void main(String[] args) {
		Time t = new Time();
		t.sethrs(12);
		t.setmin(13);
		t.setsec(14);

		System.out.println("Time : " + t.gethrs() + "h:" + t.getmin() + "m:" + t.getsec() + "s");
	}

}
