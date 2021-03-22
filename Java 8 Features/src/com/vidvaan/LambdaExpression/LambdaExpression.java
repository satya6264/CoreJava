package com.vidvaan.LambdaExpression;

interface singleee{
	public void sss();
	
}
class hello{
	public void hi() {
		System.out.println("hi");
	}
}

public class LambdaExpression{
	public static void main(String[] args) {
		singleee s = ()->{
			System.out.println("hello");
		};
		s.sss();
		
		hello h = new hello();
		h.hi();
	}
}
