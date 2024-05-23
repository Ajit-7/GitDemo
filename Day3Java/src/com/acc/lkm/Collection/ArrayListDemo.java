package com.acc.lkm.Collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
//		Non-generic
//		ArrayList arrayList = new ArrayList();
//		Generic Way
		ArrayList <String>arrayList = new ArrayList<String>();
		System.out.println("Technology Sector");
		arrayList.add("Java");
		arrayList.add("Python");
		arrayList.add("SDFC");
		arrayList.add("Oracle");
		Iterator iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(arrayList);
		arrayList.remove(7);
		System.out.println(arrayList);
		arrayList.removeIf(str->str.contains("Oracle"));
		System.out.println(arrayList);
		arrayList.removeAll(arrayList2);
		System.out.println(arrayList);
		System.out.println(arrayList2);

	}

}
