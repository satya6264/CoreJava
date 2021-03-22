package com.vidvaan.RaceCondition;

public class TestTable {
	public static void main(String[] args) {
		Table table = new Table();
		TableThread tableThread1 = new TableThread(table, 10);
		TableThread tableThread2 = new TableThread(table, 12);
		tableThread1.start();
		tableThread2.start();
	}

}
