package com.acc.lkm.PolymorphismDemo;

import java.util.Scanner;

public class PaymentMode {

	public String payment_mode(String mode1, String mode2) {
		return mode1+"\n"+mode2;
	}

	public String payment_mode(String mode3) {
		return mode3;
	}

	public static void main(String[] args) {
		
		PaymentMode pm = new PaymentMode();
		int choice = 0;
		System.out.println("Enter payment mode");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch(choice){
			case 1: System.out.println(pm.payment_mode("Digital Payment"));
					break;
			case 2: System.out.println(pm.payment_mode("Credit card", "Debit Card"));
					break;
			default: System.out.println("Invalid choice");
					break;
		}

	}
}
