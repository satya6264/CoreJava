package com.vidvaan.encapsulation;

public class TestBook {
	public static void main(String[] args) {
		Book bk1 = new Book();
		bk1.Bid = 1001;
		bk1.Bname = "Vidvaan";
		bk1.Bauthor = "Satya";
		bk1.Bcost = 570.00;

		bk1.display();
		
		Book bk10 = new Book();
		bk10.Bid = 1003;
		bk10.Bname = "Vidvaan3";
		bk10.Bauthor = "Satya3";
		bk10.Bcost = 620.00;
		
		bk10.display();
	}

}
