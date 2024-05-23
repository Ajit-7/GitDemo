package com.acc.lkm.Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
			TreeMap<String, Integer>treeMap = new TreeMap<>();
			treeMap.put("Java", 10);
			treeMap.put("Azure", 20);
			treeMap.put("SDFC", 30);
			treeMap.put("Python", 40);
			
//			for(Map.Entry m1:treeMap.entrySet()) {
//				System.out.println(m1.getKey()+" "+m1.getValue());
//			}
			
			System.out.println(treeMap);
			System.out.println(treeMap.descendingMap());
			System.out.println(treeMap.headMap("Python", true));
			System.out.println(treeMap.tailMap("Java", true));
			System.out.println(treeMap.subMap("Azure", false, "SFDC", true));
	}

}
