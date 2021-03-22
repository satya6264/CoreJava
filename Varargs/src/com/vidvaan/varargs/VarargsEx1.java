package com.vidvaan.varargs;

public class VarargsEx1 {
//	static void display(String... values){  
//		  System.out.println("display method invoked ");  
//		 }  
//		  
//		 public static void main(String args[]){  
//		  
//		 display();//zero argument   
//		 display("my","name","is","varargs");//four arguments  
//		 }   
//	
	static void display(String...values) {
		System.out.println("display method invoked");
	}
	public static void main(String[] args) {
		display();
		display("my","name");
	}
}
