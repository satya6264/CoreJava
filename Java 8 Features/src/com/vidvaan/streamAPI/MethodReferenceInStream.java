package com.vidvaan.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Productt {
	int id;
	String name;
	float price;

	public Productt(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

public class MethodReferenceInStream {
	public static void main(String[] args) {
		List<Productt> list = new ArrayList<>();
		list.add(new Productt(1, "HP Laptop", 25000f));
		list.add(new Productt(2, "Dell Laptop", 30000f));
		list.add(new Productt(3, "Lenevo Laptop", 28000f));
		list.add(new Productt(4, "Sony Laptop", 28000f));
		list.add(new Productt(5, "Apple Laptop", 90000f));

		List<Float> productPriceList = list.stream().filter(p -> p.price < 30000).map(Productt::getPrice)
				.collect(Collectors.toList());

		System.out.println(productPriceList);

	}

}
