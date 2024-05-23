package com.acc.lkm.Collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String>treeSet = new TreeSet<>();
		treeSet.add("Java");
		treeSet.add("Python");
		treeSet.add("SpringCloud");
		treeSet.add("Zen");
		System.out.println(treeSet);
		System.out.println(treeSet.pollLast());
		System.out.println(treeSet.pollFirst());
		
		NavigableSet<String>navigableSet = treeSet.descendingSet();
		Iterator<String>iterator = navigableSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
