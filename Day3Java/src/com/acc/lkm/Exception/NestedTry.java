package com.acc.lkm.Exception;

import java.io.IOException;
import java.util.Scanner;

public class NestedTry {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int [] arr = new int[5];
			for(int i = 0; i<arr.length; i++ ) {
				arr[i] = sc.nextInt();
			}
			
			for(int i = 0; i<arr.length; i++ ) {
				System.out.println(arr[i]);
			}
			
			try {
				System.out.println(arr[6]);
			}catch (Exception ex){
				System.out.println(ex+" Exception is handled");
				throw new IOException("Throw Exception");
			}
			finally {
				System.out.println("Finally Executed");
			}
		}catch (Exception ex){
			System.out.println(ex+" Exception is handled");
		}
		finally {
			System.out.println("Finally Executed");
//			main(null);
		}
		
	}

}
