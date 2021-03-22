package com.vidvaan.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class FilteringCollectionsWithoutStream {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "HP laptop", 25000f));
		list.add(new Product(2, "Dell laptop", 30000f));
		list.add(new Product(3, "Lenevo laptop", 28000f));
		list.add(new Product(4, "Sony laptop", 28000f));
		list.add(new Product(5, "Apple", 90000f));
		List<Float> productPriceList = new ArrayList<Float>();
		for (Product product : list) {
			if (product.price < 30000) {
				productPriceList.add(product.price);
			}
		}
		System.out.println(productPriceList);
	}

}
