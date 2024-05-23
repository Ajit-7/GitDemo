package com.acc.lkm.Collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapCompareByValue {

	public static void main(String[] args) {
		
				Map<Integer, String> map = new HashMap<>();
				map.put(100, "Aman");
				map.put(200, "Shubham");
				map.put(300, null);
				map.put(null, "Suman");
				map.put(100, "Prakash");
//				map.put(null, "Rashi");
//				map.put(null, null);
//				for (Map.Entry m1 : map.entrySet()) {
//					System.out.println(m1.getKey() + "" + m1.getValue());
//				}
				
				System.out.println(map);
				map.remove(null);
				map.remove(300, null);
				System.out.println(map);
				map.replace(100,  "Akash");
				System.out.println(map);
				System.out.println(map.keySet());
				System.out.println(map.values());
				System.out.println(map.entrySet());

//				map.entrySet()
//				.stream()
//				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//				.forEach(System.out::println);
			}

}
