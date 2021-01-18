package com.resource;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DriverCode {
	public static void main(String[] arg) throws IOException {
		List<Game> arr = new ArrayList<>();
		System.out.println("ArrayList is having initail capacity of 10");
		Set<Game> set = new HashSet<>();
		System.out.println("HashSet is having initail capacity of 16 and load factor 0.75");
		Map<String, Game> map = new HashMap<>();
		System.out.println("HashMap is having initail capacity of 16 and load factor 0.75");
		arr.add(new Game("Contra", "Action", "Contra is a run and gun game", 100.2f));
		arr.add(new Game("PubG", "Action", "Player Unknown's battleground", 111.5f));
		arr.add(new Game("HitMan", "Action", "Sniper stimulation game", 120.5f));
		arr.add(new Game("Chess", "Action", "Brain booster game", 10f));
		arr.add(null);
		arr.add(null);

		set.add(new Game("Contra", "Action", "Contra is a run and gun game", 100.2f));
		set.add(new Game("PubG", "Action", "Player Unknown's battleground", 111.5f));
		set.add(new Game("HitMan", "Action", "Sniper stimulation game", 120.5f));
		set.add(new Game("Chess", "Action", "Brain booster game", 10f));
		set.add(null);
		set.add(null);

		map.put("Contra", new Game("Contra", "Action", "Contra is a run and gun game", 100.2f));
		map.put("PubG", new Game("PubG", "Action", "Player Unknown's battleground", 111.5f));
		map.put("HitMan", new Game("HitMan", "Action", "Sniper stimulation game", 120.5f));
		map.put("Chess", new Game("Chess", "Action", "Brain booster game", 10f));
		map.put(null, null);
		map.put(null, null);
		map.put("try", null);
		System.out.println("Elements in Arraylist");
		for (Game game : arr) {
			System.out.println(game + "  ");
		}
		System.out.println();
		System.out.println("Elements in Hashset");
		for (Game game : set) {
			System.out.println(game + "  ");
		}
		System.out.println();
		System.out.println("Elements in Map");
		for (String string : map.keySet()) {
			System.out.println(string + "  ");
		}
		System.out.println();
		for (Game game : map.values()) {
			System.out.println(game + "  ");
		}

		// Conversion
		arr.addAll(set);
		arr.addAll(map.values());
		set.addAll(arr);
		set.addAll(map.values());
		System.out.println();
		
		// to Array
		Game[] g = new Game[10];
		g = arr.toArray(g);
		g = set.toArray(g);
		
		//Properties in java
		final Properties property = new Properties();
		property.put("Swapnil","Ubale");
		System.out.println(property.getProperty("Swapnil"));
		System.out.println(property.getOrDefault("Swapnil", "NotFound"));
		FileReader reader= new FileReader("db.properties");
		property.load(reader);
		System.out.println(property.getProperty("name"));
		System.out.println(property.getProperty("surname"));

	}
}
