package com.vidvaan.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i <= 100; i++) {
			l.add(i);
		}
		System.out.println(l);

		List<Integer> even = l.stream().filter(k -> k % 2 == 0).collect(Collectors.toList());
		System.out.println(even);
		
		List<Integer> square = even.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(square);
	}

}
