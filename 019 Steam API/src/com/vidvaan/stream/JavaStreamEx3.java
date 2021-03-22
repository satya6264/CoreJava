package com.vidvaan.stream;

import java.util.stream.Stream;

public class JavaStreamEx3 {

	public static void main(String[] args) {
		Stream.iterate(1, e -> e + 1).filter(e -> e % 6 == 0).limit(6).forEach(System.out::println);
	}

}
