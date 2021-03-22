package com.vidvaan.string.practice;

public class StringBuilderEx2 {

	public static void main(String[] args) {

		System.out.println("StringBuilder append() method");
		StringBuilder sb1 = new StringBuilder("Hello");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		sb1.append("Java");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());

		System.out.println("StringBuilder insert() method");
		StringBuilder sb2 = new StringBuilder("Hello");
		System.out.println(sb2);
		System.out.println(sb2.hashCode());
		sb2.insert(1, "Java");
		System.out.println(sb2);
		System.out.println(sb2.hashCode());

		System.out.println("StringBuilder replace() method");
		StringBuilder sb3 = new StringBuilder("Hello");
		System.out.println(sb3);
		System.out.println(sb3.hashCode());
		sb3.replace(1, 3, "Java");
		System.out.println(sb3);
		System.out.println(sb3.hashCode());

		System.out.println("StringBuilder delete() method");
		StringBuilder sb4 = new StringBuilder("Hello");
		System.out.println(sb4);
		System.out.println(sb4.hashCode());
		sb4.delete(1, 3);
		System.out.println(sb4);
		System.out.println(sb4.hashCode());

		System.out.println("StringBuilder reverse() method");
		StringBuilder sb5 = new StringBuilder("Hello Java");
		System.out.println(sb5);
		System.out.println(sb5.hashCode());
		sb5.reverse();
		System.out.println(sb5);
		System.out.println(sb5.hashCode());

		System.out.println("StringBuilder capacity() method");
		StringBuilder sb6 = new StringBuilder();
		System.out.println(sb6.capacity());
		System.out.println(sb6.hashCode());
		sb6.append("hello");
		System.out.println(sb6.capacity());
		System.out.println(sb6.hashCode());
		sb6.append("Java is my favourite language");
		System.out.println(sb6.capacity());
		System.out.println(sb6.hashCode());

		System.out.println("StringBuilder ensureCapacity() method");
		StringBuilder sb7 = new StringBuilder();
		System.out.println(sb7.capacity());
		sb7.append("hello");
		System.out.println(sb7.capacity());
		sb7.append("Java is my favourite language");
		System.out.println(sb7.capacity());
		sb7.ensureCapacity(10);
		System.out.println(sb7.capacity());
		sb7.ensureCapacity(40);
		System.out.println(sb7.capacity());

	}

}
