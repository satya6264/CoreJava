package com.vidvaan.ExceptionsUsingThrows;

public class VoteApp {
	public static boolean isCastVote(int age) {
		if (age < 18) {
			throw new InvalidAgeException(" Age is less then 18");
		}
		return true;
	}

	public static void main(String[] args) {
		try {
			System.out.println(isCastVote(16));
		} catch (InvalidAgeException e) {
			System.out.println(e.toString());
		}
	}
}
