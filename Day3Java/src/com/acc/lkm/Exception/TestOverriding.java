package com.acc.lkm.Exception;

import java.io.IOException;

import javax.xml.bind.ValidationEvent;

public class TestOverriding extends EmpDetails {

	public static void main(String[] args) throws IOException, SQLException{
		try{
			validation(1);
		}catch(Exception ex) {
			System.out.println("Exception thrown in parent");
		}
	}
	void get (int proj_id) {
		System.out.println(proj_id);
	}

}
