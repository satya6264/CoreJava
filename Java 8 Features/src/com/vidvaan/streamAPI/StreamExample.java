package com.vidvaan.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(3, 4, 5, 6);
		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(square);

		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);
		List<String> show = names.stream().collect(Collectors.toList());
		System.out.println(show);
		List<String> sorting = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sorting);

		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
		Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println(squareSet);
		numbers.stream().map(x -> x * x).collect(Collectors.toSet()).forEach(y -> System.out.println(y));

		int even = numbers.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
		System.out.println(even);

	}

}
