package com.vidvaan.stream;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamEx5 {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		Float totalPrice = productsList.stream().map(p -> p.price).reduce(0.0f, (sum, price) -> sum + price);
		System.out.println(totalPrice);

		Float totalPrice2 = productsList.stream().map(p -> p.price).reduce(0.0f, Float::sum);
		System.out.println(totalPrice2);
	}

}
