package com.acc.lkm.InheritanceDemo;

public class InheritanceTrainer extends InheritanceOrganisation {
	
	public InheritanceTrainer() {
		super(200);
		System.out.println("Training on Java");
	}
	
	public void traning(String stream) {
		System.out.println(stream);
	}
	
	public void details(String name, int base_id) {
		System.out.println("Child");
		System.out.println(name+" "+base_id);
	}

	public static void main(String[] args) {
		
	}

}
