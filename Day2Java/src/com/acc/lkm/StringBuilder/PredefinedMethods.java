package com.acc.lkm.StringBuilder;

public class PredefinedMethods {

	public static void main(String[] args) {
		String str = new String("Ajit");
		
		System.out.println(str.toUpperCase());
		System.out.println(str.replace('t','i'));
		System.out.println(str.lastIndexOf('t'));
		System.out.println(str.indexOf('j'));
		System.out.println(str.substring(1,2));
		System.out.println(str.isEmpty());
		System.out.println(str.equalsIgnoreCase("AJIT"));
		System.out.println(str.endsWith("A"));
	}

}
