package com.vidvaan.foreachmethod;

import java.util.ArrayList;
import java.util.List;

public class ForEachOrderMethod {
	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
		System.out.println("----Iteratig by passing lambda espression----");
		gamesList.stream().forEach(games -> System.out.println(games));
		System.out.println("----Iterating by passing mrthod reference----");
		gamesList.stream().forEach(System.out::println);
	}

}
