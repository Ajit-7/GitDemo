package com.acc.lkm.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		ArrayList <String>arrayList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			arrayList.add(sc.nextLine());
		}
		
		for(String obj:arrayList) {
			System.out.println(obj);
		}
	}

}
