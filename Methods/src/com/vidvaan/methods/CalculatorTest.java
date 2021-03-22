package com.vidvaan.methods;

public class CalculatorTest {
	public CalculatorTest() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalculatorTest calculator = new CalculatorTest();

		int teluguMarks = 80;
		int englishMarks = 60;
		long totalMarks = calculator.addition(teluguMarks, englishMarks);
		calculator.printTotalMarks(totalMarks);

		int[] marks = { 70, 47, 70, 43 };
		calculator.printTotalMarks(calculator.addition(marks));

		String  fname = "balaji";
		String lname = "G";
		lname.concat(fname);
		
		
	}

	private void printTotalMarks(Object addition) {
		// TODO Auto-generated method stub
		
	}

	private void printTotalMarks(long totalMarks) {
		// TODO Auto-generated method stub
		
	}

	private long addition(int teluguMarks, int englishMarks) {
		// TODO Auto-generated method stub
		return 0;
	}

	private Object addition(int[] marks) {
		// TODO Auto-generated method stub
		return null;
	}

}



