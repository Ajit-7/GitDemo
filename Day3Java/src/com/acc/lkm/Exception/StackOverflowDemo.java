package com.acc.lkm.Exception;

public class StackOverflowDemo {

	public static void main(String[] args) {
		try{
			main(null);
		}catch(Exception ex) {
			System.out.println(ex+" Overflow ho gaya Exception aa gaya");
		}
	}

}
