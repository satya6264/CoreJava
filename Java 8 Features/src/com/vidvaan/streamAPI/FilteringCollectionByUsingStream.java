package com.vidvaan.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringCollectionByUsingStream {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
//		List<Float> productPriceList2 = productsList.stream()
//				.filter(p -> p.price < 30000)// filtering data
//				.map(p -> p.price) // fetching price
//				.collect(Collectors.toList()); // collecting as list
//		System.out.println(productPriceList2);
		List<Float> plp = productsList.stream().filter(p -> p.price < 30000).map(p -> p.price)
				.collect(Collectors.toList());
		System.out.println(plp);

	}

}
