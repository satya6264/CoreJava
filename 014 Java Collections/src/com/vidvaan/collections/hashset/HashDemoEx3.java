package com.vidvaan.collections.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashDemoEx3 {
	
	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt();
		System.out.println("default random number of the x: " +x);
		int y = random.nextInt(100);
		System.out.println("setting boundries to the random number of  y: " +y);
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			int numbers = random.nextInt(10);
			list.add(numbers);
			System.out.println(list);
		}
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
				

}}
