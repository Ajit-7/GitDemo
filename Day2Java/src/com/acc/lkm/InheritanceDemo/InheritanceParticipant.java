package com.acc.lkm.InheritanceDemo;

public class InheritanceParticipant extends InheritanceOrganisation {
	
	InheritanceParticipant(){
		super(500);
		System.out.println("Learning Java Inheritance");
		System.out.println(super.facility);
	}
	
	void learning(String stream1, String stream2) {
		System.out.println(stream1+" "+stream2);
//		super.details("Accenture", "Mumbai");
	}
	
	void session() {
		System.out.println("Inheritance");
	}

	public static void main(String[] args) {
		InheritanceParticipant participant = new InheritanceParticipant();
		InheritanceTrainer trainer = new InheritanceTrainer();
		InheritanceTrainer trainer2 = new InheritanceTrainer();
		participant.learning("Java", "Python");
//		participant.training("Java SE");
		trainer.details("Bikash", 73);
		trainer2.details("Accenture", 31);
	}

}
