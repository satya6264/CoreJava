package com.vidvaan.basics;

public class TotalAverageAndPercentageOfFiveSubjects {
	public static void main(String[] args) {
		int eng = 95;
		int phy = 76;
		int chem = 85;
		int math = 90;
		int sco = 89;
		int tot = eng + phy + chem + math + sco;
		double avg = (tot / 5);
		double per = ((tot * 100) / 500);
		System.out.println("Total=" + tot);
		System.out.println("Average=" + avg);
		System.out.println("Percentage=" + per + "%");

	}
}