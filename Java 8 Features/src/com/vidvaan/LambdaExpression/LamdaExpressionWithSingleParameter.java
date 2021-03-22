package com.vidvaan.LambdaExpression;

interface sayable{
	public boolean say(String name);
}

public class LamdaExpressionWithSingleParameter {
	public static void main(String[] args) {
		sayable s = (name)->{
			return "Hello"+name != null;
		};
		System.out.println(s.say("satya"));
	}

}
