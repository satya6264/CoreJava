package com.vidvaan.encapsulation;

public class Book {
	int Bid;
	String Bname;
	String Bauthor;
	double Bcost;

	Book() {

	}

	Book(int i, String n, String a, double c) {
		Bid = i;
		Bname = n;
		Bauthor = a;
		Bcost = c;

	}

	public void setBid(int i) {
		Bid = i;
	}

	public void setBname(String n) {
		Bname = n;
	}

	public void setBauthor(String a) {
		Bauthor = a;

	}

	public void setBcost(double c) {
		Bcost = c;
	}

	public int getBid() {
		return Bid;
	}

	public String getBname() {
		return Bname;
	}

	public String getBauthor() {
		return Bauthor;
	}

	public double getBcost() {
		return Bcost;
	}

	void display() {
		System.out.println("Book ID:" + Bid);
		System.out.println("Book Name:" + Bname);
		System.out.println("Book Author:" + Bauthor);
		System.out.println("Book Cost:" + Bcost);
	}

	public static void main(String[] args) {
		Book bk1 = new Book();
		bk1.Bid = 1001;
		bk1.Bname = "Vidvaan";
		bk1.Bauthor = "Somashekar";
		bk1.Bcost = 20000.00;
		bk1.display();
		System.out.println();

		Book bk2 = new Book();
		bk2.setBid(1002);
		bk2.setBname("Java");
		bk2.setBauthor("Balaji");
		bk2.setBcost(20002.00);

		System.out.println("Book ID:" + bk2.getBid());
		System.out.println("Book Name:" + bk2.getBname());
		System.out.println("Book Author:" + bk2.getBauthor());
		System.out.println("Book ost:" + bk2.getBcost());

	}

}
