package com.vidvaan.LambdaExpression;

public class WithLambdaExpression {
	public static void main(String[] args) {
		int width = 10;
		Drawable d2 =()->{
			System.out.println("Drawing "+width);
		};
		d2.draw();
	}

}
