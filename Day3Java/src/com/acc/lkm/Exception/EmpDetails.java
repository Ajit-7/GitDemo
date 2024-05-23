package com.acc.lkm.Exception;

import java.io.IOException;
import java.sql.SQLException;

public class EmpDetails {
	
	public static void validation(int proj_id)throws IOException, SQLException {
		if(proj_id == 1) {
			throw new IOException("Project is AON");
		}else {
			throw new SQLException("Invalid Project");
		}
	}
	
	void get (int eid) throws IOException, SQLException{
		System.out.println(eid);
	}

	public static void main(String[] args) {
//		EmpDetails ed = new EmpDetails();
//		ed.validation(2);
	}

}
