package com.vidvaan.RaceCondition;

public class TableThread extends Thread {
	private Table table;
	private int num;
	public TableThread(Table table, int num) {
		super();
		this.table = table;
		this.num = num;
	}
	@Override
	public void run() {
		table.print(num);
	}

}
