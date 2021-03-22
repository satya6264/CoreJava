package com.vidvaan.Java7features;

public class StringInSwitchStatementExample2 {
	public static void main(String[] args) {
		String game = "Cricket";
		switch (game) {
		case "Hockey":
		case "Cricket":
		case "Football":
			System.out.println("This is outdoor game");
			break;
		case "Chess":
		case "Card-game":
		case "Puzzle":
		case "Indoor basketball":
			System.out.println("This is indoor game");
			break;
		default:
			System.out.println("What game it is");
		}

	}

}
