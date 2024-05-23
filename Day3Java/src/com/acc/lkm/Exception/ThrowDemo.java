package com.acc.lkm.Exception;

import java.io.IOException;

public class ThrowDemo {

	public static void main(String[] args) {
		try {
			readFile();
			
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	private static void readFile() throws IOException{
		throw new IOException("File Not Found");
	}

}
