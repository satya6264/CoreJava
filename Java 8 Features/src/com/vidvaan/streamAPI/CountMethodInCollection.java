package com.vidvaan.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class CountMethodInCollection {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(2, "Dell Laptop", 30000f));
		list.add(new Product(3, "Lenevo Laptop", 28000f));
		list.add(new Product(4, "Sony Laptop", 28000f));
		list.add(new Product(5, "Apple Laptop", 90000f));

		long count = list.stream().filter(p -> p.price < 30000).count();
		System.out.println(count);
	}

}
