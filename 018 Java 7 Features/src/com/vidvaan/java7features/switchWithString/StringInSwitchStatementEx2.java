package com.vidvaan.java7features.switchWithString;

public class StringInSwitchStatementEx2 {

	public static void main(String[] args) {
		String game = "Card-Games";
		switch (game) {
		case "Hockey":
		case "Cricket":
		case "Football":
			System.out.println("This is a outdoor game");
			break;
		case "Chess":
		case "Card-Games":
		case "Puzzles":
		case "Indoor basketball":
			System.out.println("This is a indoor game");
			break;
		default:
			System.out.println("What game it is?");
		}
	}

}
