package com.vidvaan.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class FindMaxAndMinProductPrice {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(2, "Dell Laptop", 30000f));
		list.add(new Product(3, "Lenevo Laptop", 28000f));
		list.add(new Product(4, "Sony Laptop", 28000f));
		list.add(new Product(5, "Apple Laptop", 90000f));

		Product Maximum = list.stream().max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println("Maximum price = " + Maximum.price);

		Product Minimum = list.stream().min((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println("Minimum price = " + Minimum.price);
	}

}
