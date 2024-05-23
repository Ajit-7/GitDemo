package com.acc.lkm.StringBuilder;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("Today is Day 2 of");
		stringBuilder.append("Java");		
		stringBuilder.insert(17, "Java");
		stringBuilder.replace(3, 9, "StringBuilder");
		stringBuilder.delete(4, 11);
		stringBuilder.reverse();
//		capacity & ensureCapacity()
		stringBuilder.append("Java StringBuilder is in progress");
		System.out.println(stringBuilder.capacity());
		stringBuilder.ensureCapacity(50);
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.capacity());
	}

}
