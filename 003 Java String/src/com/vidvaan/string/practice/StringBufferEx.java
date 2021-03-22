package com.vidvaan.string.practice;

public class StringBufferEx {

	public static void main(String[] args) {

		System.out.println("StringBuffer append() method");
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		sb1.append("Java");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());

		System.out.println("StringBuffer insert() method");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb2);
		System.out.println(sb2.hashCode());
		sb2.insert(1, "Java");
		System.out.println(sb2);
		System.out.println(sb2.hashCode());

		System.out.println("StringBuffer replace() method");
		StringBuffer sb3 = new StringBuffer("Hello");
		System.out.println(sb3);
		System.out.println(sb3.hashCode());
		sb3.replace(1, 3, "Java");
		System.out.println(sb3);
		System.out.println(sb3.hashCode());

		System.out.println("StringBuffer delete() method");
		StringBuffer sb4 = new StringBuffer("Hello");
		System.out.println(sb4);
		System.out.println(sb4.hashCode());
		sb4.delete(1, 3);
		System.out.println(sb4);
		System.out.println(sb4.hashCode());

		System.out.println("StringBuffer reverse() method");
		StringBuffer sb5 = new StringBuffer("Hello Java");
		System.out.println(sb5);
		System.out.println(sb5.hashCode());
		sb5.reverse();
		System.out.println(sb5);
		System.out.println(sb5.hashCode());

		System.out.println("StringBuffer capacity() method");
		StringBuffer sb6 = new StringBuffer();
		System.out.println(sb6.capacity());
		System.out.println(sb6.hashCode());
		sb6.append("hello");
		System.out.println(sb6.capacity());
		System.out.println(sb6.hashCode());
		sb6.append("Java is my favourite language");
		System.out.println(sb6.capacity());
		System.out.println(sb6.hashCode());

		System.out.println("StringBuffer ensureCapacity() method");
		StringBuffer sb7 = new StringBuffer();
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
