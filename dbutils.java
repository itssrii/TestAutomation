package com.webshop.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class dbutils {
	public ArrayList<String> getCredentialsFromDatabase() {
		ArrayList<String> cred= new ArrayList<String>();
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/javaproject","root","ramharsha2");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from TestData");  
			while(rs.next()) { 
			//System.out.println(rs.getString(1)+"  "+rs.getString(2)); 
				cred.add(rs.getString(1));
				cred.add(rs.getString(2));
			}
			con.close();  
			}
		catch(Exception e){ 
			System.out.println(e);
			}
		return cred;
	}

}
