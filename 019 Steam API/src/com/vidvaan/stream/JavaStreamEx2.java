package com.vidvaan.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamEx2 {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

//        List<Float> productPriceList2 =productsList.stream()  
//                .filter(p -> p.price > 30000)// filtering data  
//                .map(p->p.price)        // fetching price  
//                .collect(Collectors.toList()); 	
		List<String> productNameList = productsList.stream().filter(p -> p.price > 30000).map(p -> p.name)
				.collect(Collectors.toList());

		System.out.println(productNameList);

		List<Float> productPriceList = productsList.stream().filter(p -> p.price > 30000).map(p -> p.price)
				.collect(Collectors.toList());
		System.out.println(productPriceList);

		List<Integer> productIdList = productsList.stream().filter(p -> p.price > 30000).map(p -> p.id)
				.collect(Collectors.toList());
		System.out.println(productIdList);
	}

}
