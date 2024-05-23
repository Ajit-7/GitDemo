package com.acc.lkm.InheritanceDemo;

public interface emp1 {
	
	default void id(int empid) {
		System.out.println(empid);
	}
	static String org(String name) {
		return name;
	}
	
	void project()

}
