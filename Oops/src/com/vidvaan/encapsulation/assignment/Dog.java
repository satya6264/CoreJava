package com.vidvaan.encapsulation.assignment;

public class Dog {
	String Bread;
	String Size;
	String Age;
	String Color;
	String Eat;
	String Sleep;
	String Sit;
	String Run;

	Dog() {

	}

	Dog(String b, String s, String a, String c, String e, String sl, String si, String r) {
		Bread = b;
		Size = s;
		Age = a;
		Color = c;
	}

	public void setBread(String b) {
		Bread = b;
	}

	public void setSize(String s) {
		Size = s;
	}

	public void setAge(String a) {
		Age = a;
	}

	public void setColor(String c) {
		Color = c;
	}

	public String getBread() {
		return Bread;
	}

	public String getSize(String s) {
		return Size;
	}

	public String getAge(String a) {
		return Age;
	}

	public String getColor(String c) {
		return Color;
	}

	public void setEat(String e) {
		Eat = e;
	}

	public void setSleep(String sl) {
		Sleep = sl;
	}

	public void setSit(String si) {
		Sleep = si;
	}

	public void setRun(String r) {
		Run = r;
	}

	public String getEat() {
		return Eat;
	}

	public String getSleep() {
		return Size;
	}

	public String getSit() {
		return Sleep;
	}

	public String getRun() {
		return Run;
	}

	void display() {
		System.out.println("Bread :" + Bread);
		System.out.println("Size :" + Size);
		System.out.println("Age :" + Age);
		System.out.println("Color :" + Color);
		System.out.println("Eat :" + Eat);
		System.out.println("Sleep :" + Sleep);
		System.out.println("Sit :" + Sit);
		System.out.println("Run :" + Run);
	}

	public static void main(String[] args) {
		Dog nea = new Dog();
		nea.Bread = "Neapolitan Mastiff";
		nea.Size = "Large";
		nea.Age = "5 Years";
		nea.Color = "Black";
		nea.Eat = "Chicken";
		nea.Sleep = "22 hrs";
		nea.Sit = "2 hrs";
		nea.Run = "2000 meters";
		nea.display();
		System.out.println("-----------");

		Dog mal = new Dog();
		mal.Bread = "Maltese";
		mal.Size = "Small";
		mal.Age = "2 Years";
		mal.Color = "White";
		mal.Eat = "Pulihora";
		mal.Sleep = "15 hrs";
		mal.Sit = "4 hrs";
		mal.Run = "2 kilo meters";
		mal.display();
		System.out.println("------------");

		Dog chow = new Dog();
		chow.Bread = "Chow Chow";
		chow.Size = "Medium";
		chow.Age = "3 Years";
		chow.Color = "Brown";
		chow.Eat = "Mutton";
		chow.Sleep = "17 hrs";
		chow.Sit = "5 hrs";
		chow.Run = "4000 meters";
		chow.display();

		System.out.println(chow.getBread());

	}

}
