package com.acc.lkm.Collection;

import java.util.*;

public class Customer {

	public static void main(String[] args) {
		// Create a class CustomerManagement that
		// will use a LinkedList to store Customer
		// objects(cust_id,name,product & price) and the Scanner class to
		// interact with the user.

		Scanner sc = new Scanner(System.in);

		LinkedList<String> linkedList = new LinkedList<String>();

		// for(int i =0; i<4; i++) {
		// }

		int choice = 0;
		do {
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Cust_id");
				String cust_id = sc.next();
				linkedList.add(cust_id);
				System.out.println("Enter Name");
				String name = sc.next();
				linkedList.add(name);
				System.out.println("Enter Product");
				String product = sc.next();
				linkedList.add(product);
				System.out.println("Enter Price");
				String price = sc.next();
				linkedList.add(price);
				break;
			case 2:
				System.out.println("Remove");
				break;
			case 3:
				System.out.println(linkedList);
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}

		} while (choice != 0);
	}

}
