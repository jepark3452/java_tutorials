package com.jepark.collectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Code3 {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		System.out.println(map.get("one"));
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		System.out.println("=====");
		iteratorUsingForEach(map);
		System.out.println("=====");
		iteratorUsingIterator(map);
	}
	
	private static void iteratorUsingForEach(Map<String, Integer> map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	private static void iteratorUsingIterator(Map<String, Integer> map) {
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
