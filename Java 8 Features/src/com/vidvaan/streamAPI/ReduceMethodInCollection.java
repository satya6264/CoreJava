package com.vidvaan.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class ReduceMethodInCollection {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(2, "Dell Laptop", 30000f));
		list.add(new Product(3, "Lenevo Laptop", 28000f));
		list.add(new Product(4, "Sony Laptop", 28000f));
		list.add(new Product(5, "Apple Laptop", 90000f));
		Float totalPrice = list.stream().map(p -> p.price).reduce(0.0f, (sum, price) -> sum + price);
		System.out.println("Total Price = "+totalPrice);
		Float tp = list.stream().map(p -> p.price).reduce(0.0f, Float::sum);
		System.out.println("tp = "+tp);
	}

}
