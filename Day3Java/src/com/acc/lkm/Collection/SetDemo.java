package com.acc.lkm.Collection;
 
import java.util.*;

//Order cannot be maintained here in hashset
 
//To print in order use LinkedList
 
public class SetDemo {

	public static void main(String[] args) {

//		HashSet<String>h = new HashSet<>();

		LinkedHashSet<String>h = new LinkedHashSet<>();

		h.add("Spring");

		h.add("Hibernate");

		h.add("Microservices");

		h.add("Spring MVC");

		h.add("Spring ORM");

		h.add(null);

		for(String obj: h) {

			System.out.println(obj);

		}

	}

}
