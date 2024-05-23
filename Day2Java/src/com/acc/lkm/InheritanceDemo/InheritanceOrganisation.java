package com.acc.lkm.InheritanceDemo;

public class InheritanceOrganisation {
	String facility = "KDC";
	
	protected InheritanceOrganisation() {
		System.out.println("Accenture");
	}
	
	InheritanceOrganisation(int id) {
		System.out.println();
	}
	  
	public void detials(String name, int location_id) {
		System.out.println(name+" "+location_id);
	}

	public static void main(String[] args) {
		
	}

}
